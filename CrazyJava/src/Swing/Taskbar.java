package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zhoupan on 16-3-16.
 */
public class Taskbar {
    JFrame jf = new JFrame("影院售票管理系统");
    JMenuBar jb = new JMenuBar();
    JMenu basic = new JMenu("基础设置");
    JMenu tacket_manager = new JMenu("售票管理");
    JMenu vip_info = new JMenu("会员信息");
    JMenu query = new JMenu("查询统计");
    JMenu help = new JMenu("帮助");
    JMenuItem seat = new JMenuItem("座位设置");
    JMenuItem  concert_hall = new JMenuItem("演出厅设置");
    JMenuItem playset = new JMenuItem("剧目设置");
    JMenuItem showset = new JMenuItem("演出设置");
    JMenuItem saletacket = new JMenuItem("售票");
    JMenuItem returntacket = new JMenuItem("退票");
    JMenuItem  queryticket = new JMenuItem("余票查询");
    JMenuItem vip = new JMenuItem("会员信息查询");
    JMenuItem help_me = new JMenuItem("帮助");
    JTextArea jta = new JTextArea(4,20);
    public void init(){
        ActionListener menubarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("退票")){
                    JOptionPane.showConfirmDialog(null,"确认退票？");
                }else if(e.getActionCommand().equals("会员信息查询")){
                    JOptionPane.showMessageDialog(null,"用户名：周攀\n" +
                            "时间：20150820");
                }
                else {
                    System.out.println("点击了" + e.getActionCommand() + "菜单");
                    jta.append("点击了" + e.getActionCommand() + "菜单\n");
                }
            }
        };
        basic.add(seat);
        basic.add(concert_hall);
        basic.add(playset);
        basic.add(showset);
        tacket_manager.add(saletacket);
        tacket_manager.add(returntacket);
        vip_info.add(vip);
        query.add(queryticket);
        help.add(help_me);
        playset.addActionListener(menubarListener);
        returntacket.addActionListener(menubarListener);
        vip.addActionListener(menubarListener);
        jb.add(basic);
        jb.add(tacket_manager);
        jb.add(vip_info);
        jb.add(query);
        jb.add(help);
        jf.add(jb);
        jf.add(jta,BorderLayout.SOUTH);
        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("hello");
                System.exit(0);
            }
        });
        jf.pack();
        jf.setVisible(true);

    }
    public void info(){

    }
    public static void main(String[] args) {
        new Taskbar().init();
    }
}
