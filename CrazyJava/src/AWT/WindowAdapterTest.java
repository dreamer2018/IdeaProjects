package AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Created by zhoupan on 16-3-15.
 */
public class WindowAdapterTest {
    Frame f = new Frame("测试窗口");
    TextArea ta = new TextArea(6,40);
    private void init(){
        f.addWindowListener(new MyWindowsListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }
    class  MyWindowsListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            int i=JOptionPane.showConfirmDialog(null,null);
            if(i == 1){

            }
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new WindowAdapterTest().init();
    }
}
