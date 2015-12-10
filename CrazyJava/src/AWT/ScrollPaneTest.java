package AWT;

import java.awt.*;

/**
 * Created by zhoupan on 12/10/15.
 */
public class ScrollPaneTest {
    public static void main(String[] args) {
        Frame f=new Frame("测试窗口");
        ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField(20));
        sp.add(new Button("单击我"));
        f.add(sp);
        f.setBounds(500,500,250,120);
        f.setVisible(true);
    }
}
