package PhotographInvoiceSystem;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class SignUP extends javax.swing.JFrame {
    public SignUP() {
        initComponents();
        setSize(1280,815);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(640, 90, 73, 25);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(640, 150, 89, 25);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(640, 220, 89, 25);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 340, 68, 25);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 410, 57, 25);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 480, 124, 33);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Shipping Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(640, 570, 160, 25);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jButton1.setText("Signup");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 370, 150, 37);

        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(820, 90, 389, 28);

        jTextField2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(820, 150, 389, 31);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(820, 220, 389, 33);

        jTextField3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(820, 340, 389, 31);

        jTextField4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(820, 410, 389, 31);

        jTextField5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(820, 470, 389, 57);

        jTextField6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(820, 560, 389, 51);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("        Retype Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 280, 155, 19);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(820, 280, 389, 30);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton2.setText("Logout >>");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1140, 10, 120, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 20, 215, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\green.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 1280, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     boolean flag = true;
        String s1;
        String s2;
        String s3;
        int s4;
        String s5;
        String s6;
        String s7;
        String s8;
        s1 = jTextField1.getText();  //name
        s2 = jTextField2.getText(); //username
        s3 = jPasswordField1.getText(); //password
        s8 = jPasswordField2.getText(); // retype password
        s4 = Integer.parseInt(jTextField3.getText());
        s5 = jTextField4.getText(); //email
        s6 = jTextField5.getText(); //address
        s7 = jTextField6.getText(); //shipping address
        for ( int i = 0; i < s5.length(); i++){
            if ( s5.charAt(i) == '@'){
              flag = false;   
            }
        }       
         if ( flag == false){
            register_1 c;
            c = new register_1();
            try {
                    c.register(s1,s2,s3,s4,s5,s6,s7,s8);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(register_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            new Login().setVisible(true);
        }else {
         JOptionPane.showMessageDialog(null,"wrong email id!!!!! enter properly!!!!1");
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Login().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
