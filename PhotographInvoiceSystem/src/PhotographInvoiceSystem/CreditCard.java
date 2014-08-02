package PhotographInvoiceSystem;
import java.sql.*;
public class CreditCard extends Payments{
    private String creditCardNumber;
    private String PIN;
    CreditCard(String myCardNumber, String myPIN){
        creditCardNumber = myCardNumber;
        PIN = myPIN;
    }
    public boolean verify(){
        boolean status = false;
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
                ResultSet  rs = s.executeQuery("select * from creditcard");
                while (rs.next()) {
                    if( creditCardNumber.equals(rs.getString("cardnumber")) &&  PIN.equals(rs.getString("PIN")) ){
                        status = true;
                    }
                }
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
       return status;
    }
   public void makePayment(String orderId){
      Connection con=null;
      System.out.println ( "in credit card class" + orderId);
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
