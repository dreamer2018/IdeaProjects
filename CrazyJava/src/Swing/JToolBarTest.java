package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhoupan on 16-3-17.
 */
public class JToolBarTest {
    JFrame jf = new JFrame("测试窗口");
    JToolBar jtb = new JToolBar();
    JMenuBar jmb = new JMenuBar();
    Icon buttonIcon = new ImageIcon("About24.gif");
    JButton jbt = new JButton("测试",buttonIcon);
    public void init(){
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"测试成功");
            }
        });
        jtb.add(jbt);
        jmb.add(jtb);
        jf.setJMenuBar(jmb);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new JToolBarTest().init();
    }
}
