package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zhoupan on 16-3-16.
 */
public class Taskbar{
    //基础窗口
    JFrame jf = new JFrame("影院售票管理系统");
    JPanel jp = new JPanel();
    //菜单栏
    JMenuBar jb = new JMenuBar();
    JMenu basic = new JMenu("基础设置");
    JMenu tacket_manager = new JMenu("售票管理");
    JMenu vip_info = new JMenu("会员信息");
    JMenu query = new JMenu("查询统计");
    JMenu help = new JMenu("帮助");
    Icon seatIcode = new ImageIcon("1.png");
    JMenuItem seat = new JMenuItem("座位设置",seatIcode);
    Icon hallIcode = new ImageIcon("1.png");
    JMenuItem  concert_hall = new JMenuItem("演出厅设置",hallIcode);
    JMenuItem playset = new JMenuItem("剧目设置");
    JMenuItem showset = new JMenuItem("演出设置");
    JMenuItem saletacket = new JMenuItem("售票");
    JMenuItem returntacket = new JMenuItem("退票");
    JMenuItem  queryticket = new JMenuItem("余票查询");
    JMenuItem vip = new JMenuItem("会员信息查询");
    Icon helpIcode = new ImageIcon("Help24.gif");
    JMenuItem help_me = new JMenuItem("帮助",helpIcode);
    JMenuItem add = new JMenuItem("增加",helpIcode);
    //工具栏
    JToolBar jtb = new JToolBar();
    Icon sale_tacket_icon = new ImageIcon("1.png");
    JButton sale_tacket = new JButton("售票",sale_tacket_icon);
    Icon return_tacket_icon = new ImageIcon("2.png");
    JButton return_tacket = new JButton("退票",return_tacket_icon);
    Icon vip_query_icon = new ImageIcon("1.png");
    JButton vip_query = new JButton("会员查询",vip_query_icon);
    Icon info_query_icon = new ImageIcon("2.png");
    JButton info_query = new JButton("信息查询",info_query_icon);
    Icon quit_icon = new ImageIcon("1.png");
    JButton quit = new JButton("退出",quit_icon);
    //文本框
    JTextArea jta = new JTextArea(4,20);
    JPanel jp2 = new JPanel();
    //设置GridBagLayout布局管理器
    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    public void init() {
        //设置菜单栏监听
        ActionListener menubarListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("退票")) {
                    JOptionPane.showConfirmDialog(null, "确认退票？");
                } else if (e.getActionCommand().equals("会员信息查询")) {
                    JOptionPane.showMessageDialog(null, "用户名：周攀\n" +
                            "时间：20150820");
                } else {
                    System.out.println("点击了" + e.getActionCommand() + "菜单");
                    jta.append("点击了" + e.getActionCommand() + "菜单\n");
                }
            }
        };
        //设置菜单栏内容
        basic.add(seat);
        basic.addSeparator();
        basic.add(concert_hall);
        basic.addSeparator();
        basic.add(playset);
        basic.addSeparator();
        basic.add(showset);
        tacket_manager.add(saletacket);
        tacket_manager.addSeparator();
        tacket_manager.add(returntacket);
        vip_info.add(vip);
        query.add(queryticket);
        help.add(help_me);
        help.add(add);
        playset.addActionListener(menubarListener);
        returntacket.addActionListener(menubarListener);
        vip.addActionListener(menubarListener);
        //将菜单内容加入到菜单中
        jb.add(basic);
        jb.add(tacket_manager);
        jb.add(vip_info);
        jb.add(query);
        jb.add(help);
        //添加工具栏
        sale_tacket.addActionListener(menubarListener);
        jtb.add(sale_tacket);
        return_tacket.addActionListener(menubarListener);
        jtb.add(return_tacket);
        vip_query.addActionListener(menubarListener);
        jtb.add(vip_query);
        info_query.addActionListener(menubarListener);
        jtb.add(info_query);
        quit.addActionListener(menubarListener);
        jtb.add(quit);
        //设置工具栏是否可以移动
        jtb.setFloatable(true);
        jp.setLayout(new BorderLayout());
        jp.add(jtb, BorderLayout.BEFORE_FIRST_LINE);

        //设置布局管理器
        jf.setLayout(new BorderLayout());
        jf.setJMenuBar(jb);
        //将工具栏加入到布局管理器中
        jf.add(jp, BorderLayout.BEFORE_FIRST_LINE);
        // jf.add(jta);

        //设置窗口监听
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
    public static void main(String[] args) {
        new Taskbar().init();
    }
}


