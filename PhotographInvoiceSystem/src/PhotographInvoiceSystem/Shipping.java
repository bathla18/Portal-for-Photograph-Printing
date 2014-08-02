package PhotographInvoiceSystem;
import java.sql.*;
import javax.swing.JOptionPane;

    public class Shipping {
    private String shippingId;
    private String shippingType;
    private String shippingAddress;
    Shipping(String myshippingType,String myshippingAddress){
        shippingType = myshippingType;
        shippingAddress = myshippingAddress;
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
        System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
         try{
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
            Statement s=con.createStatement();
            try {
                ResultSet  rs = s.executeQuery("select max(shippingId) from shipping");
                while(rs.next()){
                    int maxid = Integer.parseInt( rs.getString(1)) + 1;
                    shippingId = String.format("%d", maxid);
                }
                s.executeQuery("insert into shipping values('"+shippingId+"' , '"+shippingType+"', '"+shippingAddress+"')");
                new ShippingInfo().setVisible(false);
                JOptionPane.showMessageDialog(null, "order placed confirmation email sent","Photofunia",1);
                JOptionPane.showMessageDialog(null, "order process complete","Photofunia",1);
                } catch (SQLException e) {
                    System.out.println(e.toString());
                }
            }catch(Exception e)
            {
                System.out.println("Second Exception:"+e.toString());
            }

         try{
             con.close();
         }
         catch(Exception e){
             System.out.println("Error in closing");
         }
    }
    /*public void updateInfo(String myshippingId,String myshippingType,String myshippingAddress){
        Connection con=null;
       try {
           Class.forName("oracle.jdbc.OracleDriver");
       }catch(ClassNotFoundException e) {
        System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
         try{
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
            Statement s=con.createStatement();
            try {
                s.executeQuery("update shipping set shippingType = '"+myshippingType+"' , shippingAddress = '"+myshippingAddress+"' where shippingId = '"+myshippingId+"'");
                } catch (SQLException e) {
                    System.out.println(e.toString());
                }
            }catch(Exception e)
            {
                System.out.println("Second Exception:"+e.toString());
            }
         try{
             con.close();
         }
         catch(Exception e){
             System.out.println("Error in closing");
         }
    }*/
}
