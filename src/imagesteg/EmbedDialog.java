/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmbedDialog.java
 *
 * Created on Apr 16, 2013, 1:35:05 PM
 */
package imagesteg;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sunil
 */
public class EmbedDialog extends javax.swing.JDialog {

    /** Creates new form EmbedDialog */
    public EmbedDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setWindowInScreenCenter();
    }

    public final void setWindowInScreenCenter() {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((int) size.getWidth() / 2 - getWidth() / 2, (int) size.getHeight() / 2 - getHeight() / 2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btcancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tabEmbed = new javax.swing.JTabbedPane();
        panelChooseInputImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInputImage = new javax.swing.JTextField();
        panelInputImage = new imagesteg.ImagePanel();
        btEmbedBrowse = new javax.swing.JButton();
        btNextImage = new javax.swing.JButton();
        lbInputMsg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInputMessage = new javax.swing.JTextArea();
        btNextMessage = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbEncryptedMessage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbOriginalMessage = new javax.swing.JLabel();
        btEncryptMessage = new javax.swing.JButton();
        btNextEncrypt = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbEmbeddedMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        btcancel.setText("Close");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });
        jPanel1.add(btcancel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        panelChooseInputImage.setBackground(new java.awt.Color(102, 255, 255));
        panelChooseInputImage.setLayout(null);

        jLabel1.setText("Input Image");
        panelChooseInputImage.add(jLabel1);
        jLabel1.setBounds(10, 30, 80, 14);
        panelChooseInputImage.add(txtInputImage);
        txtInputImage.setBounds(90, 30, 310, 20);

        btEmbedBrowse.setText("Browse");
        btEmbedBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmbedBrowseActionPerformed(evt);
            }
        });

        btNextImage.setText("Next");
        btNextImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInputImageLayout = new javax.swing.GroupLayout(panelInputImage);
        panelInputImage.setLayout(panelInputImageLayout);
        panelInputImageLayout.setHorizontalGroup(
            panelInputImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputImageLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btEmbedBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(btNextImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        panelInputImageLayout.setVerticalGroup(
            panelInputImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmbedBrowse)
                    .addComponent(btNextImage))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        panelChooseInputImage.add(panelInputImage);
        panelInputImage.setBounds(20, 100, 720, 270);
        panelChooseInputImage.add(lbInputMsg);
        lbInputMsg.setBounds(20, 70, 440, 20);

        tabEmbed.addTab("Step 1 : Choose input image", panelChooseInputImage);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(null);

        jLabel2.setText("Write message below");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(21, 21, 138, 14);

        txtInputMessage.setColumns(20);
        txtInputMessage.setRows(5);
        jScrollPane1.setViewportView(txtInputMessage);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(21, 46, 430, 170);

        btNextMessage.setText("Next");
        btNextMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextMessageActionPerformed(evt);
            }
        });
        jPanel3.add(btNextMessage);
        btNextMessage.setBounds(20, 240, 110, 23);

        tabEmbed.addTab("Step 2 : Write down your message", jPanel3);

        jPanel4.setLayout(null);
        jPanel4.add(lbEncryptedMessage);
        lbEncryptedMessage.setBounds(20, 170, 600, 20);

        jLabel4.setText("Original Message :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(22, 30, 110, 30);
        jPanel4.add(lbOriginalMessage);
        lbOriginalMessage.setBounds(140, 30, 400, 30);

        btEncryptMessage.setText("Encrypt");
        btEncryptMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncryptMessageActionPerformed(evt);
            }
        });
        jPanel4.add(btEncryptMessage);
        btEncryptMessage.setBounds(20, 110, 120, 23);

        btNextEncrypt.setText("Next");
        btNextEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextEncryptActionPerformed(evt);
            }
        });
        jPanel4.add(btNextEncrypt);
        btNextEncrypt.setBounds(160, 110, 110, 23);

        tabEmbed.addTab("Step 3 : Encrypt message", jPanel4);

        jPanel5.setLayout(null);

        jButton1.setText("Embed message in image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(21, 28, 270, 30);
        jPanel5.add(lbEmbeddedMessage);
        lbEmbeddedMessage.setBounds(30, 80, 600, 30);

        tabEmbed.addTab("Step 4 : Embed encrypted message", jPanel5);

        jPanel2.add(tabEmbed, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btcancelActionPerformed

    private void btEmbedBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmbedBrowseActionPerformed
        browseEmbedImage();
}//GEN-LAST:event_btEmbedBrowseActionPerformed

    private void btNextImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextImageActionPerformed
        tabEmbed.setSelectedIndex(1);
    }//GEN-LAST:event_btNextImageActionPerformed

    private void btNextMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextMessageActionPerformed
        
        if(txtInputImage.getText().trim().length()>0){
            lbOriginalMessage.setText(txtInputMessage.getText().trim());
            tabEmbed.setSelectedIndex(2);
        }
    }//GEN-LAST:event_btNextMessageActionPerformed

    private void btNextEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextEncryptActionPerformed
        tabEmbed.setSelectedIndex(3);
    }//GEN-LAST:event_btNextEncryptActionPerformed

    private void btEncryptMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncryptMessageActionPerformed
        encryptMessage();
    }//GEN-LAST:event_btEncryptMessageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        embedMessageNow();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                EmbedDialog dialog = new EmbedDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private boolean encrypted;
    private boolean messageWritten;
    private boolean imageSelected;
    private String messageToEncrypt;
    private Image imageToBeUsed;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmbedBrowse;
    private javax.swing.JButton btEncryptMessage;
    private javax.swing.JButton btNextEncrypt;
    private javax.swing.JButton btNextImage;
    private javax.swing.JButton btNextMessage;
    private javax.swing.JButton btcancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEmbeddedMessage;
    private javax.swing.JLabel lbEncryptedMessage;
    private javax.swing.JLabel lbInputMsg;
    private javax.swing.JLabel lbOriginalMessage;
    private javax.swing.JPanel panelChooseInputImage;
    private imagesteg.ImagePanel panelInputImage;
    private javax.swing.JTabbedPane tabEmbed;
    private javax.swing.JTextField txtInputImage;
    private javax.swing.JTextArea txtInputMessage;
    // End of variables declaration//GEN-END:variables

    private void browseEmbedImage() {
        final JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Images", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            lbInputMsg.setText("Loading image...");

            new Thread(new Runnable() {
                public void run() {
                    setEmbedImage(chooser);
                }
            }).start();

        }
    }

    private void setEmbedImage(JFileChooser chooser) {
        String filename = chooser.getSelectedFile().getAbsolutePath();
        txtInputImage.setText(filename);
        panelInputImage.setImage(Toolkit.getDefaultToolkit().getImage(filename));
        imageToBeUsed = Toolkit.getDefaultToolkit().getImage(filename);
        panelInputImage.repaint();

        lbInputMsg.setText("Image loaded...");    
        imageSelected = true;
    }

    private void encryptMessage() {
        SecretKey key = null;
        try {
            key = KeyGenerator.getInstance("DES").generateKey();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(EmbedDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] keydata = key.getEncoded();

        DataOutputStream bout = null;
        try {
            bout = new DataOutputStream(new FileOutputStream("secret.key",false));
            bout.write(keydata);
        } catch (Exception e) {
        }
        finally{
            try{
                bout.close();
            }
            catch(Exception ex){
            }
        }

        // Create encrypter/decrypter class
        EncryptClass encrypter = new EncryptClass(key);
        String message = lbOriginalMessage.getText();

        // Encrypt
        String encryptedMessage = encrypter.encrypt(message);

        lbEncryptedMessage.setText(encryptedMessage);
    }

    private void embedMessageNow() {
        final String message = lbEncryptedMessage.getText();

        lbEmbeddedMessage.setText("Embedding message...");

        new Thread(new Runnable() {

            public void run() {
                try {
                    insertMessageInImage(message);
                } catch (Exception ex) {
                }
            }
        }).start();
    }

    private void insertMessageInImage(String message) {
        String image = txtInputImage.getText();
        Steganography ob = new Steganography();

        image = image.replace("\\", "/");

        String imagepath = image.substring(0,image.lastIndexOf("/"));
        String imagename = image.substring(image.lastIndexOf("/")+1, image.lastIndexOf("."));
        String newimagename = "new_" + imagename;
        String extension = image.substring(image.lastIndexOf(".")+1);

        final String inputPath = imagepath + "\\" + newimagename + "." + extension;
        final String destPath = imagepath + "\\steg.zip";
        final String zipimagename = newimagename + "." + extension;

        ob.encode(imagepath, imagename, extension, newimagename, message);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        lbEmbeddedMessage.setText("Now compressing...");

        new Thread(new Runnable() {
            public void run() {
                compress(zipimagename, inputPath, destPath);
            }
        }).start();
    }

    private void compress(String imagename, String inputImage, String destPath){

        System.out.println("[" + imagename + "]");

        int BUFFER = 2048;
        try {
         BufferedInputStream origin = null;
         FileOutputStream dest = new FileOutputStream(destPath);
         ZipOutputStream out = new ZipOutputStream(new  BufferedOutputStream(dest));
         
         byte data[] = new byte[BUFFER];

            FileInputStream fi = new
              FileInputStream(inputImage);
            origin = new
              BufferedInputStream(fi, BUFFER);
            ZipEntry entry = new ZipEntry(imagename);
            out.putNextEntry(entry);
            int count;
            while((count = origin.read(data, 0,
              BUFFER)) != -1) {
               out.write(data, 0, count);
            }
            origin.close();

            out.close();
      } catch(Exception e) {
         System.out.println("Error compressing image : " + e.getMessage());
      }
        
        lbEmbeddedMessage.setText("Finished...");
    }
}