/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcduino.test;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
    
    public int draws = 0;
    Image image;

    public ImagePanel() {
        image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("pins.jpg"));
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600, 456);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);        
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
        draws++;
    }
}
