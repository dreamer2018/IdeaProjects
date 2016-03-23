package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhoupan on 16-3-9.
 */
public class SwingTest {
    public void init(){
        JFrame f = new JFrame("TEST");
        JDialog d = new JDialog();
        d.add(new JButton());
        d.setVisible(true);
        f.setSize(800,400);
        //获取图片
        Image img = Toolkit.getDefaultToolkit().createImage("Close12.gif");
        //设置任务栏图片
        f.setIconImage(img);
        //设置任务栏名字
        f.setTitle("Hello");
        //设置是否关闭,0不关闭，大于0，关闭
        //f.setDefaultCloseOperation(0);

        f.setResizable(true);
        //设置布局格式
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
