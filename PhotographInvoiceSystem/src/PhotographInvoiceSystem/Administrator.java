 package PhotographInvoiceSystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class Administrator extends User {
    private String name;
    private String eMail;
    private String aid;
    private long phoneno;
    private String address;
    Administrator(String user,String password){
        userId = user;
        passwd = password;
    }
    
    // function to verify login of administrator
    
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
                ResultSet  rs = s.executeQuery("select * from users,administrator where users.userid = administrator.userid");
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
    
    //function to execute order by administrator
    
    public boolean executeOrder(String orderno){
        boolean res = false;
        String s1 = "true";
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
                ResultSet  rs = s.executeQuery("select * from orderinfo");
                while (rs.next()) {
                    if( orderno.equals(rs.getString("orderid")) && s1.equals(rs.getString("status") )){
                                res = true;
                    }
                }
                if ( res == false){
                    JOptionPane.showMessageDialog(null, "order is yet to be confirmed");
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
        return res;
    }
    
    // function to deleteorder
    
    public boolean deleteOrder(String orderno){
        boolean res = false;
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
                ResultSet  rs = s.executeQuery("select * from orderinfo");
                while (rs.next()) {
                    if( orderno.equals(rs.getString("orderid"))){
                                res = true;
                    s.execute("delete from orderinfo where orderid = '"+ orderno +"'");
                  
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
         return res;
    }
}
