package AWT;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/3/13.
 */
public class BoxSpaceTest {
    private Frame f =new Frame("���Դ���");
    private Box h = Box.createHorizontalBox();
    private Box v = Box.createVerticalBox();
    public void init(){
        h.add(new Button("ˮƽ��ťһ"));
        h.add(Box.createHorizontalGlue());
        h.add(new Button("ˮƽ��ť��"));
        h.add(Box.createHorizontalStrut(10));
        h.add(new Button("ˮƽ��ť��"));
        v.add(new Button("��ֱ��ťһ"));
        v.add(Box.createVerticalGlue());
        v.add(new Button("��ֱ��ť��"));
        v.add(Box.createVerticalStrut(10));
        v.add(new Button("��ֱ��ť��"));
        f.add(h,BorderLayout.NORTH);
        f.add(v);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxSpaceTest().init();
    }
}
