package PhotographInvoiceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
public class register_1 {
     public void register(String s1,String s2,String s3,int s4,String s5, String s6, String s7,String s8 )throws ClassNotFoundException{
       try {
           int flag = 0;
           if(!(s3.equals(s8))){
                     JOptionPane.showMessageDialog(null, "your passwords didnot match with the previous one!!!!");
                     s3 = JOptionPane.showInputDialog("Enter password");
                     s8 = JOptionPane.showInputDialog("Reenter password"); 
               }
              if ( flag != 2){
                    enter(s1,s2,s3,s4,s5,s6,s7);
              }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUP.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
    public void enter(String p1,String p2,String p3,int p4,String p5,String p6,String p7) throws ClassNotFoundException{
        try{
             Class.forName("oracle.jdbc.OracleDriver");
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ankit");
             
             Statement st1 = con.createStatement();
             String str1 = "insert into users values ( '"+p2+"','"+p3+"')";
         
             ResultSet rel_2 = st1.executeQuery(str1);
           
             Statement st = con.createStatement();
             String str = "insert into customer values( '"+p1+"','"+p2+"' ,'"+p3+"' ,'"+p4+"', '"+p5+"', '"+p6+"', '"+p7+"')";
             ResultSet rel_1 = st.executeQuery(str);
             JOptionPane.showMessageDialog(null, "congrates!!!!!! u registered sucessfully!!!!!!","Photofunia",1);
             
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "user name exist","Photofunia",1);
       }        
    }
}
