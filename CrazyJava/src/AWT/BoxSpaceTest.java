package AWT;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/3/13.
 */
public class BoxSpaceTest {
    private Frame f =new Frame("测试窗口");
    private Box h = Box.createHorizontalBox();
    private Box v = Box.createVerticalBox();
    public void init(){
        h.add(new Button("水平按钮一"));
        h.add(Box.createHorizontalGlue());
        h.add(new Button("水平按钮二"));
        h.add(Box.createHorizontalStrut(10));
        h.add(new Button("水平按钮三"));
        v.add(new Button("垂直按钮一"));
        v.add(Box.createVerticalGlue());
        v.add(new Button("垂直按钮二"));
        v.add(Box.createVerticalStrut(10));
        v.add(new Button("垂直按钮三"));
        f.add(h,BorderLayout.NORTH);
        f.add(v);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxSpaceTest().init();
    }
}
