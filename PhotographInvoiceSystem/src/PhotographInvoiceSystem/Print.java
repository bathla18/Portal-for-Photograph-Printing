package PhotographInvoiceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Print extends javax.swing.JFrame {
    
    static Administrator admin;
    Print(Administrator newadmin) {
        admin = newadmin;
        initComponents();
        setSize(1350,725);
    }
    int flag = 0;
    Print() {
       initComponents();
       setSize(1350,725);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        ordernumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print");
        getContentPane().setLayout(null);

        print.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(410, 430, 100, 33);

        ordernumber.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        ordernumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordernumberActionPerformed(evt);
            }
        });
        getContentPane().add(ordernumber);
        ordernumber.setBounds(480, 190, 229, 31);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 190, 199, 34);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Print Order");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 20, 400, 60);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton2.setText("Send Confirmation Email");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 570, 270, 33);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1040, 20, 140, 30);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 320, 100, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1070, 610, 220, 80);

        jButton5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton5.setText("Confirm Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(140, 320, 180, 30);

        jButton6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton6.setText("Show All Order");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(140, 430, 240, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\Free-Desktop-Background-Wallpaper-1-2.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1340, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       
    }//GEN-LAST:event_printActionPerformed

    private void ordernumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordernumberActionPerformed
       
    }//GEN-LAST:event_ordernumberActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

        String orderno = ordernumber.getText();
        boolean isexecuted = admin.executeOrder(orderno);
        if(isexecuted){
            flag = 1;
            JOptionPane.showMessageDialog(null, "Picture print confirmation email sent","Photofunia",1);
            admin.deleteOrder(orderno);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Order number","Photofunia",1);
        }
    }//GEN-LAST:event_printMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ( flag == 1 ){
             JOptionPane.showMessageDialog(null, "email sent","Photofunia",1);
             flag = 0;
        }else {
            JOptionPane.showMessageDialog(null, "enter order number first","Photofunia",1);
            flag = 0;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible (false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   
        String orderno = ordernumber.getText();
        boolean isdeleted = admin.deleteOrder(orderno);
        if(isdeleted){
            JOptionPane.showMessageDialog(null, "order deleted sucessfully","PhotoFunia",1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Order number", "PhotoFunia", 1);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String s3 = JOptionPane.showInputDialog("Enter Order Number");
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
        }
        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
            Statement s1=con.createStatement();
            Statement s=con.createStatement();
            try {
              //  int flag = 0;
                ResultSet  rs = s1.executeQuery("select * from orderinfo");
                while (rs.next()) {
                    if( s3.equals(rs.getString("orderid"))){
                             s.execute ( "update orderinfo set status = '"+true+"' where orderid = '"+s3+"'");  
                             flag = 1;
                    }
                }
                if ( flag == 0){
                    JOptionPane.showMessageDialog(null,"Invalid Order Number","PhotoFunia",1);
                }else {
                JOptionPane.showMessageDialog(null,"order confirm","PhotoFunia",1);
                }
            }
             catch (SQLException e) {
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
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        new show_all_order().setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print(admin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField ordernumber;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables

}
