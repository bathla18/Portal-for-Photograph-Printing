package PhotographInvoiceSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class place_order extends javax.swing.JFrame {
    String userid;
    public place_order(String user) {
        userid = user;
        initComponents();
        setSize(800,480);
    }
    public void  place_order1(String user) {
        userid = user;
        String name = "";
        Connection con=null;
        try {
           Class.forName("oracle.jdbc.OracleDriver");
        }catch(ClassNotFoundException e) {
            System.out.println("Oops! Can't find classoracle.jdbc.driver.OracleDriver");
         }
            try{
               con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","ankit");
               Statement s=con.createStatement();
               ResultSet  rs = s.executeQuery ( "select name from customer where userid = '" + userid+"'");
               while ( rs.next()){
                   name = rs.getString(1);
               }
              } catch (SQLException e) {
                    System.out.println(e.toString());
              }
        jLabel3.setText (name);
        
        initComponents();
        setSize(800,480);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(650, 10, 110, 27);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 250, 140, 27);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton2.setText("Change Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 330, 140, 27);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel1.setText("welcome ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 120, 63, 19);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 110, 120, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 220, 70);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jButton3.setText("Order History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 390, 140, 27);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\Digital photography workshop.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 770, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            ChoosePhoto k = new ChoosePhoto(userid);
            k.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          new change_order ( userid).setVisible(true);
          this.setVisible(false);
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       new order_history(userid).setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(place_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(place_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(place_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(place_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new place_order().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
