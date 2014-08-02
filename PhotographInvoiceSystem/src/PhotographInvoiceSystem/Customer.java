package PhotographInvoiceSystem;
import java.sql.*;
public class Customer extends User{
    private String name;
    private String eMail;
    private String cid;
    private int phoneno;
    private String address;
    
    Customer(String user,String password){
        userId = user;
        passwd = password;
    }
    public boolean verifyLogin(){
        boolean loginstatus = false;
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
                ResultSet  rs = s.executeQuery("select * from users,customer where users.userid = customer.userid");
                while (rs.next()) {
                    if( userId.equals(rs.getString("userid")) &&  passwd.equals(rs.getString("password")) ){
                
                        loginstatus = true;
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
       return loginstatus;
    }
  /*  public void update(){
    }*/
    public String getcid(){
        return cid;
    }
}
