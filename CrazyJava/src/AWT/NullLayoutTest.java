package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhoupan on 16-3-12.
 */
public class NullLayoutTest {
    Frame f = new Frame("测试窗口");
    Button b1 = new Button("第一个按钮");
    Button b2 = new Button("第二个按钮");

    public void init(){
        f.setLayout(null);
        b1.setBounds(200,300,90,28);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1();
            }
        });
        f.add(b1);
        b2.setBounds(500,450,120,35);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"真的可以呢！");
            }
        });
        f.add(b2);
        f.setBounds(50,50,200,100);
        f.setVisible(true);


    }
    public  void m1(){
        JOptionPane.showMessageDialog(null,"Hello World");
    }

    public static void main(String[] args) {
        new NullLayoutTest().init();
    }
}
