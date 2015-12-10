package AWT;

import java.awt.*;

/**
 * Created by zhoupan on 12/10/15.
 */
public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f=new Frame("测试窗口");
        f.setLayout(new BorderLayout(3,5));
        f.add(new Button("南") , BorderLayout.SOUTH);
        f.add(new Button("北") , BorderLayout.NORTH);
        f.add(new Button("中"));
        f.add(new Button("东"), BorderLayout.EAST);
        f.add(new Button("西"), BorderLayout.WEST);
        f.pack();
        f.setVisible(true);
    }
}
