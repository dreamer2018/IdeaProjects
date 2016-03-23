package AWT;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by zhoupan on 16-3-13.
 */
public class EventQs {
    private Frame f = new Frame("测试事件");
    private Button ok = new Button("确定");
    private TextField tf = new TextField(30);
    public void init(){
       // ok.addActionListener(new okListener());
       // ok.addFocusListener( new okfocus());
        ok.addMouseListener(new okmouse());
        f.add(tf);
        f.add(ok,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }
    class okListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("用户单击了ok按钮");
            tf.setText("Hello world");
        }
    }
    class okfocus implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("用户进入ok按钮");
            tf.setText("Hello world——1");
        }

        @Override
        public void focusLost(FocusEvent e) {
            System.out.println("用户离开ok按钮");
            tf.setText("Hello world--2");
        }
    }
    class okmouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("用户单击了ok按钮");
            tf.setText("Hello world-2");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("用户按压了ok按钮");
            tf.setText("Hello world-3");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("用户释放了ok按钮");
            tf.setText("Hello world-4");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("用户进入ok按钮");
            tf.setText("Hello world-5");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("用户离开了ok按钮");
            tf.setText("Hello world-6");
        }
    }

    public static void main(String[] args) {
        new EventQs().init();
    }
}