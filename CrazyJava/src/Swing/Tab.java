package Swing;

/**
 * Created by zhoupan on 16-3-17.
 */

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 * Created by zhoupan on 16-3-17.
 */


class addTab implements MouseListener {
    JPanel jp;
    JLabel lab ;
    JLabel lab3=new JLabel();
    public addTab(){
        lab= new JLabel("选项卡1");
        JLabel lab1 = new JLabel("选项卡");
        jp=new JPanel();
        GridLayout gl= new GridLayout(1,1,10,0);
        jp.setLayout(gl);
        lab1.setHorizontalAlignment(JLabel.LEFT);//设置文字显示在最左边
        lab3.setHorizontalAlignment(JLabel.RIGHT);// 设置文字显示在最右边
        jp.add(lab1);
        jp.add(lab3);
        Tab.pane.addTab("i",lab);
        Tab.pane.setTabComponentAt(Tab.pane.indexOfComponent(lab),jp);//实现这个功能的就这一条最重要的语句
        lab3.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub
        Tab.pane.remove(Tab.pane.indexOfTabComponent(jp));
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        lab3.setText("x ");
    }
    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        lab3.setText("");
    }
    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }
}
public class Tab extends JFrame implements ActionListener {
    JMenuItem mi;
    static JTabbedPane pane;
    public Tab() {
        super("选项卡窗格");
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi = new JMenuItem("增加");
        JMenu menu = new JMenu("增加");
        menu.add(mi);
        JMenuBar bar = new JMenuBar();
        bar.add(menu);
        setJMenuBar(bar);
        pane = new JTabbedPane();
        add(pane);
        new addTab();
        mi.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==mi){
            new addTab();
        }
    }
}
