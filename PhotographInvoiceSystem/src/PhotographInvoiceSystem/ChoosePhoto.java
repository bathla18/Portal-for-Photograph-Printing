package PhotographInvoiceSystem;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
public class ChoosePhoto extends javax.swing.JFrame {

   // private static Customer cust;
   public String name;
    public String path;
    public String cid;
    public String sz;
    public int cnt;
    public int flag = 0;
    private File[] selectedfiles;
    public ChoosePhoto(String userid) {
        name = userid;
        initComponents();
        setSize(1350,725);
    }

    ChoosePhoto() {
         setSize(1350,725);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse = new javax.swing.JButton();
        fileselector = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        count = new javax.swing.JTextField();
        size = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose Photo");
        getContentPane().setLayout(null);

        browse.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        browse.setText("Browse");
        browse.setName("browse"); // NOI18N
        browse.setOpaque(false);
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browseMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMouseClicked(evt);
            }
        });
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        getContentPane().add(browse);
        browse.setBounds(650, 190, 120, 33);

        fileselector.setName("fileLocation"); // NOI18N
        fileselector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileselectorActionPerformed(evt);
            }
        });
        getContentPane().add(fileselector);
        fileselector.setBounds(300, 200, 275, 20);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select  Photos");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 50, 440, 70);

        count.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        count.setName("count"); // NOI18N
        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        getContentPane().add(count);
        count.setBounds(300, 310, 270, 25);

        size.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        size.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Japanese Postcard-Rs 100", "Legal-Rs 500", "Letter-Rs 200", "Tabloid-Rs 50" }));
        size.setName("size"); // NOI18N
        size.setOpaque(false);
        size.setRequestFocusEnabled(false);
        size.setVerifyInputWhenFocusTarget(false);
        size.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sizeMouseEntered(evt);
            }
        });
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });
        getContentPane().add(size);
        size.setBounds(650, 300, 255, 31);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No. of copies");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 310, 129, 25);

        ok.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        ok.setText("OK");
        ok.setName("ok"); // NOI18N
        ok.setOpaque(false);
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(440, 450, 110, 33);

        cancel.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.setName("cancel"); // NOI18N
        cancel.setOpaque(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(440, 560, 120, 33);

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
        jButton1.setBounds(1140, 20, 150, 33);

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.setOpaque(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 20, 140, 33);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\photofunia.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1060, 570, 240, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\BATHLA\\Desktop\\project photos\\neptune_wallpaper_hd-HD.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1350, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
   
    }//GEN-LAST:event_browseActionPerformed

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
       
    }//GEN-LAST:event_countActionPerformed

    private void fileselectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileselectorActionPerformed
       
    }//GEN-LAST:event_fileselectorActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        cid = name;
        sz = size.getModel().getSelectedItem().toString();
        cnt = Integer.parseInt(count.getText());
        new Payment(cid,sz,cnt,path).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       new Login().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        
    }//GEN-LAST:event_sizeActionPerformed

    private void browseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseClicked

        JFileChooser filechooser= new JFileChooser();
        filechooser.setDialogTitle("Choose Your File");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //below codes for select  the file 
        int returnval=filechooser.showOpenDialog(this);
        if(returnval==JFileChooser.APPROVE_OPTION)
        {
            File file = filechooser.getSelectedFile();
            BufferedImage bi;
            try
            {   
                bi=ImageIO.read(file);
       
            File file1 = filechooser.getSelectedFile();
            String fullPath = file1.getAbsolutePath();
            this.path = fullPath;
            System.out.println(path+" ="+fullPath);
             setSize(1500,1000);
            }
            catch(IOException e)
            {
              System.out.println("wrong");
            }
            
        this.pack();
        setSize(1350,725);
         
    } 
    }//GEN-LAST:event_browseMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked

    }//GEN-LAST:event_okMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    place_order k = new place_order(name);
                    k.setVisible(true);
                  
                    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1MouseExited

    private void browseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseEntered
        browse.setForeground(Color.YELLOW);
    }//GEN-LAST:event_browseMouseEntered

    private void browseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseExited
        browse.setForeground(Color.BLACK);
    }//GEN-LAST:event_browseMouseExited

    private void okMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseEntered
       ok.setForeground(Color.YELLOW);
    }//GEN-LAST:event_okMouseEntered

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setForeground(Color.YELLOW);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setForeground(Color.BLACK);
    }//GEN-LAST:event_cancelMouseExited

    private void sizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMouseEntered
        size.setForeground(Color.YELLOW);
    }//GEN-LAST:event_sizeMouseEntered

    private void sizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMouseExited
        size.setForeground(Color.BLACK);
    }//GEN-LAST:event_sizeMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel2MouseExited

    private void okMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseExited
        ok.setForeground(Color.BLACK);
    }//GEN-LAST:event_okMouseExited

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new ChoosePhoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browse;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField count;
    private javax.swing.JTextField fileselector;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox size;
    // End of variables declaration//GEN-END:variables

}
