package picturetopennies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.BorderFactory;

public class ImageWindow 
    extends JFrame {
    
    public ImageWindow() {
        this.init();
    }
    
    private void init() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Picture of Pennies");
        this.setResizable(true);
        
        this.imagePanel = new ImagePanel(null);
        //this.imagePanel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        
        this.getContentPane().setBackground(new Color(255,40,40));
        this.setBackground(new Color(40,40,40));
        
        
        this.getContentPane().add(this.imagePanel);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        
        this.setBounds(0, 0, width, height - 40);
    }
    
    
    public void setPicture(BufferedImage img) {
        if (imagePanel == null) return;
        imagePanel.setImage(img);
        
        this.repaint();
    }
    
    public BufferedImage getPicture() {
        if (imagePanel == null) return null;
        return imagePanel.getImage();
    }
    
    private ImagePanel imagePanel;
}
