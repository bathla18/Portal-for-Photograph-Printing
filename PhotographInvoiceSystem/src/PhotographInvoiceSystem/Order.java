package PhotographInvoiceSystem;
import java.sql.*;
import javax.swing.JOptionPane;
public class Order {
    private String orderId;
    private String customerId;
    private boolean status;
    private int count;
    private String size;
    private float amount;
    private String path1;
    Order(){
    }
    public void placeOrder(String cid,String sz,int c, String path ){
        System.out.println( "amount" + amount + "orderId"+ orderId+"customerId"+customerId+"size"+size+"status"+status+"count"+count+"");
        status = false;
        customerId = cid;
        size = sz;
        count = c;
        path1 = path;
        System.out.println ( "1status=" + status);
        System.out.println("customerid"+customerId);
        System.out.println("size"+size);
        System.out.println("count"+count);
        System.out.println("path1"+path1);
        Connection con=null;
       try {
           Class.forName("oracle.jdbc.OracleDriver");
       }catch(ClassNotFoundException e) {
        System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
         try{
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
            Statement s=con.createStatement();
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
              try{
                  
                ResultSet  rs1 = s.executeQuery("select max(orderid) from orderinfo");
                while(rs1.next()){
                    int maxid = Integer.parseInt( rs1.getString(1)) + 1;
                    orderId = String.format("%d", maxid);
                    System.out.println( "order" +orderId );
                }
                s.execute("insert into orderinfo values( '"+orderId+"','"+customerId+"' ,'"+size+"' ,'"+status+"', '"+path1+"','"+count+"','"+amount+"')");    
                JOptionPane.showMessageDialog(null,"Your order placed with orderid = "+orderId,"Photofunia",1);
                JOptionPane.showMessageDialog(null,"Your order cost is = "+amount,"Photofunia",1);
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
    

