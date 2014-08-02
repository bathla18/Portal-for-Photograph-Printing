package PhotographInvoiceSystem;
import java.awt.Color;
import javax.swing.*;
public class Payment extends javax.swing.JFrame {
    private static Order ord;
    public String name;
    public String path;
    public String cid;
    public String sz;
    public int cnt;
    public String orderid;
    public int flag = 0;
  
   public  Payment() {
       initComponents();
       setSize(1350,725);
        
    }
    Payment(String cid1, String sz1, int cnt1, String path1) {
         cid = cid1;
         sz = sz1;
         cnt = cnt1;
         path = path1;
         flag = 1;
         initComponents();
         setSize(1350,725);
    }
    
    Payment(String cid1, String sz1, int cnt1, String path1,String orderno) {
         cid = cid1;
         sz = sz1;
         cnt = cnt1;
         path = path1;
         orderid = orderno; 
         initComponents();
         setSize(1350,725); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        direct = new javax.swing.JRadioButton();
        credit = new javax.swing.JRadioButton();
        labelcredit = new javax.swing.JLabel();
        creditCardNumber = new javax.swing.JTextField();
        labelpin = new javax.swing.JLabel();
        PIN = new javax.swing.JPasswordField();
        Pay = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment ");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 140, 172, 25);

        buttonGroup1.add(direct);
        direct.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        direct.setForeground(new java.awt.Color(255, 255, 255));
        direct.setText("Direct");
        direct.setOpaque(false);
        direct.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                directStateChanged(evt);
            }
        });
        getContentPane().add(direct);
        direct.setBounds(220, 140, 100, 33);

        buttonGroup1.add(credit);
        credit.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        credit.setForeground(new java.awt.Color(255, 255, 255));
        credit.setSelected(true);
        credit.setText("Credit Card");
        credit.setOpaque(false);
        credit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                creditStateChanged(evt);
            }
        });
        credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditActionPerformed(evt);
            }
        });
        getContentPane().add(credit);
        credit.setBounds(370, 140, 150, 33);

        labelcredit.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        labelcredit.setForeground(new java.awt.Color(255, 255, 255));
        labelcredit.setText("Credit Card Number");
        getContentPane().add(labelcredit);
        labelcredit.setBounds(50, 270, 210, 25);

        creditCardNumber.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        creditCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardNumberActionPerformed(evt);
            }
        });
        getContentPane().add(creditCardNumber);
        creditCardNumber.setBounds(50, 320, 300, 25);

        labelpin.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        labelpin.setForeground(new java.awt.Color(255, 255, 255));
        labelpin.setText("PIN");
        getContentPane().add(labelpin);
        labelpin.setBounds(50, 370, 60, 25);

        PIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PINActionPerformed(evt);
            }
        });
        getContentPane().add(PIN);
        PIN.setBounds(50, 410, 300, 20);

        Pay.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        Pay.setText("Pay");
        Pay.setOpaque(false);
        Pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PayMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayMouseClicked(evt);
            }
        });
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });
        getContentPane().add(Pay);
        Pay.setBounds(50, 540, 160, 41);

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter the Payment Details");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 20, 520, 80);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton1.setText("Logout >>");
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1143, 10, 180, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1060, 610, 250, 70);

        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PNB", "SBI", "BOI", "OBC" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(60, 200, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\indianRupeeIdentity04big.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1350, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditActionPerformed

    }//GEN-LAST:event_creditActionPerformed

    private void creditCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardNumberActionPerformed
        
    }//GEN-LAST:event_creditCardNumberActionPerformed

    private void PINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PINActionPerformed
       
    }//GEN-LAST:event_PINActionPerformed

    private void creditStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_creditStateChanged

        if(credit.isSelected()==true){
            creditCardNumber.setVisible(true);
            PIN.setVisible(true);
            labelcredit.setVisible(true);
            labelpin.setVisible(true);
            jComboBox1.setVisible(true);
        }
        
    }//GEN-LAST:event_creditStateChanged

    private void directStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_directStateChanged

        if(direct.isSelected()==true){
            creditCardNumber.setVisible(false);
            PIN.setVisible(false);
            labelcredit.setVisible(false);
            labelpin.setVisible(false);
            jComboBox1.setVisible(false);
        }
        
    }//GEN-LAST:event_directStateChanged

    private void PayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseClicked

        if(direct.isSelected()==true){
            DirectPayment k = new DirectPayment();
            k.makePayment(cid);
            Order myorder = new Order();
            System.out.println ( "flag set");
            myorder.placeOrder(cid,sz,cnt,path);
            new ShippingInfo().setVisible(true);
            this.dispose();
        }
        else{
            boolean flag1 = true;
            String myCardNo ="";
            String myPin ="";
                 myCardNo = creditCardNumber.getText();
                 myPin = PIN.getText();
                 if (myCardNo.length() == 16 && myPin.length() <= 4){
                    flag1 = false;
             
                 }
            if ( flag1 == true){
                   JOptionPane.showMessageDialog(null, "wrong credit card info!!!!! enter again!!!!!","Photofunia",1);
            }else {
                CreditCard mypayment = new CreditCard(myCardNo,myPin);
                boolean result = mypayment.verify();
                if(result == true){
                    JOptionPane.showMessageDialog(null, "Payment done","Photofunia",1);
                    
                    if ( flag == 1){
                        mypayment.makePayment(cid);
                        Order myorder = new Order();
                        System.out.println ( "flag set");
                        myorder.placeOrder(cid,sz,cnt,path);  
                        new ShippingInfo().setVisible(true);
                        this.dispose();
                    }else {
                         mypayment.makePayment(cid);
                         order_change k = new order_change();
                         k.placeOrder_change(cid,sz,cnt,path,orderid);  
                         new ShippingInfo().setVisible(true);
                         this.dispose();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Wrong CreditCard Number or PIN","Photofunia",1);
                }
            }
        }
    }//GEN-LAST:event_PayMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Login().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setForeground(Color.YELLOW); 
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

    private void PayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseEntered
        Pay.setForeground(Color.YELLOW);
    }//GEN-LAST:event_PayMouseEntered

    private void PayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseExited
        Pay.setForeground(Color.black);
    }//GEN-LAST:event_PayMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //  new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PIN;
    private javax.swing.JButton Pay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton credit;
    private javax.swing.JTextField creditCardNumber;
    private javax.swing.JRadioButton direct;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelcredit;
    private javax.swing.JLabel labelpin;
    // End of variables declaration//GEN-END:variables

}
