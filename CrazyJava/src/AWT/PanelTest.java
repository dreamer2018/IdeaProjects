package AWT;

import java.awt.*;

/**
 * Created by zhoupan on 12/10/15.
 */
public class PanelTest {
    public static void main(String[] args) {
        Frame f=new Frame("测试窗口");
        Panel p=new Panel();
        p.add(new TextField(20));
        p.add(new Button("单击我"));
        f.add(p);
        f.setBounds(500,500,250,200);
        f.setVisible(true);
    }
}
