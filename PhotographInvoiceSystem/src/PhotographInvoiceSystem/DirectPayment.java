package PhotographInvoiceSystem;
import java.sql.*;
public class DirectPayment extends Payments{
    DirectPayment(){
    }

    public void makePayment(String orderId){
        System.out.println ( "in directpayment class"+orderId);
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
                ResultSet  rs = s.executeQuery("select max(paymentid) from payment");
                    while(rs.next()){
                    int maxid = Integer.parseInt( rs.getString(1)) + 1;
                    paymentId = String.format("%d", maxid);
                }
                    String s1 = "done";
                    System.out.println ( "paymentid"+paymentId);
                    System.out.println ( "paymentid"+orderId);
                    System.out.println ( "paymentid"+s1);
                    s.execute("insert into payment values('"+paymentId+"','"+orderId+"','"+s1+"')");
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

}
