package Swing;

/**
 * Created by zhoupan on 16-3-17.
 */

import java.awt.*;

import javax.swing.*;

/**
 * Test
 * @author Tom
 *
 */
public class TestDemo {

    public static void main(String[] args) {
        /*
        try {
            String feel = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(feel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        JFrame frame = new JFrame();
        frame.setTitle("可关闭Tab测试");
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        //tabbedPane.setCloseButtonEnabled(true);
        tabbedPane.addTab("测试一", null, new JPanel().add(new JButton("hello")));
        tabbedPane.addTab("测试二", null, new JLabel("测试二"));
        tabbedPane.addTab("测试三", null, new JLabel("测试三"));
        tabbedPane.addTab("测试四", null, new JLabel("测试四"));
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
