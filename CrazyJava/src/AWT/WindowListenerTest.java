package AWT;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by zhoupan on 16-3-13.
 */
public class WindowListenerTest {
    private Frame f = new Frame("测试");
    private TextArea ta = new TextArea(6,40);
    public void init(){
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);

    }
    class  MyListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            ta.append("窗口被初次打开！\n");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            ta.append("窗口被关闭！\n");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            ta.append("用户窗口成功关闭！\n");
            //System.out.println("用户窗口成功关闭！");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            ta.append("窗口被最小化！\n");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            ta.append("窗口被恢复！\n");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            ta.append("窗口被激活！\n");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            ta.append("窗口失去焦点！\n");
        }
    }

    public static void main(String[] args) {
        new WindowListenerTest().init();
    }
}
