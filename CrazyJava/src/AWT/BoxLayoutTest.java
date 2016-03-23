package AWT;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhoupan on 16-3-12.
 */
public class BoxLayoutTest {
    private Frame f = new Frame("测试");
    public void init(){
        f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        f.add(new Button("第一个按钮"));
        f.add(new Button("按钮二"));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
