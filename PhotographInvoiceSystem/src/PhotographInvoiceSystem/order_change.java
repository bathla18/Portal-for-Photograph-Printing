package PhotographInvoiceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class order_change {
    private String orderId;
    private String customerId;
    private boolean status;
    private int count;
    private String size;
    private float amount;
    private String path1;

    order_change() {
    }
    void placeOrder_change(String cid, String sz, int c, String path,String orderno) {
        status = false;
        customerId = cid;
        size = sz;
        count = c;
        path1 = path;
        orderId = orderno;
        System.out.println ( "1status=" + status);
        System.out.println("customerid"+customerId);
        System.out.println("size"+size);
        System.out.println("count"+count);
        System.out.println("path1"+path1);
        System.out.println("orderno"+orderId);
        Connection con=null;
        try {
           Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
         }
            try{
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
           
            Statement s1=con.createStatement();
            try {
                ResultSet  rs = s1.executeQuery("select * from price");
                while (rs.next()) {
                    if( size.equals(rs.getString("sizes"))){
                        
                       amount = count * Float.parseFloat( rs.getString("cost"));
                        System.out.println( "amount" + amount);
                    }
                }
            } catch (SQLException e) {
                    System.out.println(e.toString());
            }
           
                System.out.println("ankit bathla");
                System.out.println ( "1status=" + status);
                System.out.println("1customerid"+customerId);
                System.out.println("1size"+size);
                System.out.println("1count"+count);
                System.out.println("1path1"+path1);
                System.out.println("1orderno"+orderId);
                System.out.println("amount"+amount);
                Statement s=con.createStatement();
                s.execute("update orderinfo SET sizes = '"+size+"',status = '"+status+"',path = '"+path1+"',count = "+count+",cost = "+amount+" where orderid = "+orderno+"" );            
                JOptionPane.showMessageDialog(null,"Your order updated with orderid = "+orderId,"Photofunia",1);
                JOptionPane.showMessageDialog(null,"Your order cost is = "+amount,"Photofunia",1);
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
}