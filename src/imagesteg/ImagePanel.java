/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package imagesteg;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author jangwan
 */
public class ImagePanel extends JPanel{

    private Image img;

    public void setImage(Image img){
        this.img = img;
    }

    public void paintComponent(Graphics g){
        if(g!=null)
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
