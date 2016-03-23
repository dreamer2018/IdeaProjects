package AWT;

import java.awt.*;

/**
 * Created by Administrator on 2016/3/13.
 */
public class CanvasTest {
    private Frame f = new Frame("测试窗口");
    public void init(){
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
        f.add(new Button("开始"));
        Canvas c= new Canvas();
        c.setVisible(true);
        f.add(c);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CanvasTest().init();
    }
}
