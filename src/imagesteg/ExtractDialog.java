/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExtractDialog.java
 *
 * Created on Apr 16, 2013, 6:08:12 PM
 */
package imagesteg;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ashutosh
 */
public class ExtractDialog extends javax.swing.JDialog {

    /** Creates new form ExtractDialog */
    public ExtractDialog(java.awt.Frame parent, boolean modal) {
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
        btEmbedBrowse = new javax.swing.JButton();
        txtInputImage = new javax.swing.JTextField();
        panelInputImage = new imagesteg.ImagePanel();
        btNextImage = new javax.swing.JButton();
        lbInputMsg = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btExtractMessage = new javax.swing.JButton();
        lbEmbeddedMessage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEncryptionKey = new javax.swing.JTextField();
        btKeyBrowse = new javax.swing.JButton();

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

        panelChooseInputImage.setLayout(null);

        jLabel1.setText("Compressed File : ");
        panelChooseInputImage.add(jLabel1);
        jLabel1.setBounds(10, 30, 100, 14);

        btEmbedBrowse.setText("Browse");
        btEmbedBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmbedBrowseActionPerformed(evt);
            }
        });
        panelChooseInputImage.add(btEmbedBrowse);
        btEmbedBrowse.setBounds(410, 30, 120, 23);
        panelChooseInputImage.add(txtInputImage);
        txtInputImage.setBounds(120, 30, 280, 20);

        javax.swing.GroupLayout panelInputImageLayout = new javax.swing.GroupLayout(panelInputImage);
        panelInputImage.setLayout(panelInputImageLayout);
        panelInputImageLayout.setHorizontalGroup(
            panelInputImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        panelInputImageLayout.setVerticalGroup(
            panelInputImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        panelChooseInputImage.add(panelInputImage);
        panelInputImage.setBounds(20, 100, 720, 270);

        btNextImage.setText("Next");
        btNextImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextImageActionPerformed(evt);
            }
        });
        panelChooseInputImage.add(btNextImage);
        btNextImage.setBounds(540, 30, 100, 23);
        panelChooseInputImage.add(lbInputMsg);
        lbInputMsg.setBounds(20, 70, 440, 20);

        tabEmbed.addTab("Step 1 : Choose input image", panelChooseInputImage);

        jPanel5.setLayout(null);

        btExtractMessage.setText("Extract message in image");
        btExtractMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtractMessageActionPerformed(evt);
            }
        });
        jPanel5.add(btExtractMessage);
        btExtractMessage.setBounds(20, 80, 270, 30);
        jPanel5.add(lbEmbeddedMessage);
        lbEmbeddedMessage.setBounds(20, 130, 610, 30);

        jLabel5.setText("Secret Key");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(20, 30, 110, 20);
        jPanel5.add(txtEncryptionKey);
        txtEncryptionKey.setBounds(130, 30, 310, 20);

        btKeyBrowse.setText("Browse");
        btKeyBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeyBrowseActionPerformed(evt);
            }
        });
        jPanel5.add(btKeyBrowse);
        btKeyBrowse.setBounds(450, 30, 120, 23);

        tabEmbed.addTab("Step 2 : Extract encrypted message", jPanel5);

        jPanel2.add(tabEmbed, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        this.dispose();
}//GEN-LAST:event_btcancelActionPerformed

    private void btEmbedBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmbedBrowseActionPerformed
        browseEncryptedImage();
}//GEN-LAST:event_btEmbedBrowseActionPerformed

    private void btNextImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextImageActionPerformed
        tabEmbed.setSelectedIndex(1);
}//GEN-LAST:event_btNextImageActionPerformed

    private void btExtractMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtractMessageActionPerformed
        lbEmbeddedMessage.setText("Extracting message...");

        new Thread(new Runnable() {

            public void run() {
                extractMessageNow();
            }
        }).start();

}//GEN-LAST:event_btExtractMessageActionPerformed

    private void btKeyBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeyBrowseActionPerformed
        browseKey();
}//GEN-LAST:event_btKeyBrowseActionPerformed

    private void extractMessageNow() {
        String image = txtInputImage.getText();
        image = image.replace("\\", "/");

        String imagepath = image.substring(0, image.lastIndexOf("/"));
        String extension = image.substring(image.lastIndexOf(".") + 1);

        Steganography ob = new Steganography();

        extractedFileName = extractedFileName.replace("\\", "/");
        
        imagepath = extractedFileName.substring(0, extractedFileName.lastIndexOf("/"));
        
        String imagename = extractedFileName.substring(extractedFileName.lastIndexOf("/") + 1, extractedFileName.lastIndexOf("."));

        extension = extractedFileName.substring(extractedFileName.lastIndexOf(".")+1);

        System.out.println(imagepath + " , " + imagename);

        // Create encrypter/decrypter class
        final String msg = ob.decode(imagepath, imagename, extension);

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        lbEmbeddedMessage.setText("Now decrypting message...");

        new Thread(new Runnable() {

            public void run() {
                try {
                    decode(msg);
                } catch (Exception ex) {
                }
            }
        }).start();
    }

    private void decode(String msg) {

        String keypath = txtEncryptionKey.getText();

        byte[] keydata = null;
        DataInputStream din = null;
        try {
            din = new DataInputStream(new FileInputStream(keypath));
            keydata = new byte[din.available()];
            din.read(keydata);
        } catch (Exception e) {
            lbEmbeddedMessage.setText("Error loading key data : " + e.getMessage());
            return;
        } finally {
            try {
                din.close();
            } catch (Exception ex) {
            }
        }

        SecretKey key = new SecretKeySpec(keydata, "DES");

        EncryptClass encrypter = new EncryptClass(key);

        String decrypted = encrypter.decrypt(msg);

        lbEmbeddedMessage.setText("Message = " + decrypted);
    }

    private void browseKey() {
        final JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Key Files", "key");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            lbEmbeddedMessage.setText("Loading key...");

            new Thread(new Runnable() {

                public void run() {
                    setKey(chooser);
                }
            }).start();

        }
    }

    private void setKey(JFileChooser chooser) {
        String filename = chooser.getSelectedFile().getAbsolutePath();
        txtEncryptionKey.setText(filename);
        lbEmbeddedMessage.setText("Key loaded...");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ExtractDialog dialog = new ExtractDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    Image imageToBeUsed;
    String extractedFileName;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEmbedBrowse;
    private javax.swing.JButton btExtractMessage;
    private javax.swing.JButton btKeyBrowse;
    private javax.swing.JButton btNextImage;
    private javax.swing.JButton btcancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbEmbeddedMessage;
    private javax.swing.JLabel lbInputMsg;
    private javax.swing.JPanel panelChooseInputImage;
    private imagesteg.ImagePanel panelInputImage;
    private javax.swing.JTabbedPane tabEmbed;
    private javax.swing.JTextField txtEncryptionKey;
    private javax.swing.JTextField txtInputImage;
    // End of variables declaration//GEN-END:variables

    private void browseEncryptedImage() {
        final JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Compressed File", "zip");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            lbInputMsg.setText("Loading image...");

            new Thread(new Runnable() {

                public void run() {
                    setEncryptedImage(chooser);
                }
            }).start();
        }
    }

    private void setEncryptedImage(JFileChooser chooser) {

        int BUFFER = 2048;
        String filename = chooser.getSelectedFile().getAbsolutePath();
        txtInputImage.setText(filename);

        ZipEntry entry = null;

        try {
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(filename);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            entry = zis.getNextEntry();
            System.out.println("Extracting: " + entry.getName());
            int count;
            byte data[] = new byte[BUFFER];

            filename = chooser.getSelectedFile().getParent() + "\\" + entry.getName();

            FileOutputStream fos = new FileOutputStream(filename);
            dest = new BufferedOutputStream(fos, BUFFER);
            while ((count = zis.read(data, 0, BUFFER))
                    != -1) {
                dest.write(data, 0, count);
            }
            dest.flush();
            dest.close();

            zis.close();
        } catch (Exception e) {
            System.out.println("Error extracting file : " + e.getMessage());
            return;
        }

        extractedFileName = filename;

        panelInputImage.setImage(Toolkit.getDefaultToolkit().getImage(filename));
        imageToBeUsed = Toolkit.getDefaultToolkit().getImage(filename);
        panelInputImage.repaint();

        lbInputMsg.setText("Image loaded...");
    }
}
