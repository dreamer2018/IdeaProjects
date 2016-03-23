package AWT;

import java.awt.*;

/**
 * Created by zhoupan on 12/10/15.
 */
public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        f.setLayout(new BorderLayout(30,5));
        f.add(new Button("南"), BorderLayout.SOUTH);
        f.add(new Button("北") , BorderLayout.NORTH);
        Panel p=new Panel();
        p.add(new TextField(20));
        p.add(new Button("点击我"));
        f.add(p);
        //f.add(new Button("东"), BorderLayout.EAST);
        f.add(new Button("西"), BorderLayout.WEST);
        f.pack();
        f.setVisible(true);
    }
}
