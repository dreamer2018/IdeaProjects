package Swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by zhoupan on 16-3-9.
 */
public class SwingTest {
    public void init(){
        JFrame f = new JFrame("TEST");
        f.setSize(800,400);
        Image img = Toolkit.getDefaultToolkit().createImage("Close12.gif");
        f.setIconImage(img);
        f.setLayout(new BorderLayout());
        f.add(new JButton("南"),BorderLayout.EAST);
        //f.add(new JColorChooser(),BorderLayout.NORTH);
        //f.add(new JFileChooser(),BorderLayout.WEST);
        f.add(new JCheckBox(),BorderLayout.CENTER);
        f.add(new JComboBox<String>());
        f.setVisible(true);


    }
    public static void main(String[] args) {
        SwingTest st = new SwingTest();
        st.init();
    }
}
