package AWT;

import java.awt.*;

/**
 * Created by zhoupan on 12/10/15.
 */
public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame f=new Frame("测试窗口");
        f.setLayout(new FlowLayout(FlowLayout.TRAILING,20,5));
        for( int i = 0 ; i < 10 ; i++ ){
            f.add( new Button("按钮"+i));
        }
        f.pack();
        f.setVisible(true);
    }
}
