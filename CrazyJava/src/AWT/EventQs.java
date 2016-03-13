package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhoupan on 16-3-13.
 */
public class EventQs {
    private Frame f = new Frame("测试事件");
    private Button ok = new Button("确定");
    private TextField tf = new TextField(30);
    public void init(){
        ok.addActionListener(new okListener());
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

    public static void main(String[] args) {
        new EventQs().init();
    }
}