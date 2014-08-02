package PhotographInvoiceSystem;
import java.awt.Color;
public class ShippingInfo extends javax.swing.JFrame {
public ShippingInfo() {
        initComponents();
        setSize(1350,725);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        train = new javax.swing.JRadioButton();
        air = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shipping Info");
        getContentPane().setLayout(null);

        address.setColumns(20);
        address.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(546, 160, 300, 130);

        buttonGroup1.add(train);
        train.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        train.setForeground(new java.awt.Color(255, 255, 255));
        train.setSelected(true);
        train.setText("By Post");
        train.setBorder(null);
        train.setOpaque(false);
        train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainActionPerformed(evt);
            }
        });
        getContentPane().add(train);
        train.setBounds(430, 370, 120, 40);

        buttonGroup1.add(air);
        air.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        air.setForeground(new java.awt.Color(255, 255, 255));
        air.setText("By Courier");
        air.setOpaque(false);
        getContentPane().add(air);
        air.setBounds(720, 360, 150, 50);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Address");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 200, 120, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Shipping Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 30, 600, 90);

        OK.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        OK.setText("OK");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        getContentPane().add(OK);
        OK.setBounds(570, 510, 120, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1060, 590, 260, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\wooden.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1350, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainActionPerformed
       
    }//GEN-LAST:event_trainActionPerformed

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked

        String type;
        if(train.isSelected()==true){
            type = "post";
        }
        else{
            type = "courier";
        }
        String add = address.getText();
        Shipping newship = new Shipping(type,add);
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_OKMouseClicked

    private void OKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseEntered
       OK.setForeground(Color.YELLOW);
    }//GEN-LAST:event_OKMouseEntered

    private void OKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseExited
        OK.setForeground(Color.black);
    }//GEN-LAST:event_OKMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShippingInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JTextArea address;
    private javax.swing.JRadioButton air;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton train;
    // End of variables declaration//GEN-END:variables

}
