package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

/**
 * Created by zhoupan on 16-3-18.
 */
public class setSeat {
    JFrame jf = new JFrame("座位设置");
        JLabel hail = new JLabel();
        JLabel row_X = new JLabel();
        JLabel row_Y = new JLabel();
        String[] hail_select_string = {"一号厅","二号厅","三号厅","四号厅","五号厅","六号厅","七号厅","八号厅"};
        JComboBox<String> hail_select = new JComboBox<>(hail_select_string);
        String[] row_X_select_string = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        JComboBox<String> row_X_select = new JComboBox<>(row_X_select_string);
        String[] row_Y_select_string = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14"};
        JComboBox<String> row_Y_select = new JComboBox<>(row_Y_select_string);
        JButton confirm = new JButton("确认");
        JButton exit = new JButton("退出");
    public void init(){
        jf.setSize(251,198);
        int windowWidth = jf.getWidth();
        int winowHeight = jf.getHeight();
        double screenHeighth=getDimension().getHeight();
        double screenWidth=getDimension().getWidth();
        System.out.println(screenHeighth+""+screenWidth);
        jf.setLocation(((int)screenWidth-windowWidth)/2,((int)screenHeighth-winowHeight)/2);
        confirm.addActionListener(new buttonListener());
        exit.addActionListener(new buttonListener());
        jf.setLayout(new GridLayout(4,2));
        hail.setText("  请选择影厅：");
        hail.setFont(new Font("楷体",Font.ITALIC,16));
        row_X.setText("  请选择行：");
        row_X.setFont(new Font("楷体",Font.ITALIC,16));
        row_Y.setText("  请选择列：");
        row_Y.setFont(new Font("楷体",Font.ITALIC,16));
        jf.addWindowListener(new windowListener());
        jf.add(hail);
        jf.add(hail_select);
        jf.add(row_X);
        jf.add(row_X_select);
        jf.add(row_Y);
        jf.add(row_Y_select);
        jf.add(confirm);
        jf.add(exit);
        jf.setVisible(true);
        jf.setResizable(false);
    }
    public Dimension  getDimension(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        return screenSize;
    }
    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("确认")) {
                int i = hail_select.getSelectedIndex();
                String s = row_X_select.getSelectedItem().toString();
                System.out.println(s);
                System.out.println(row_Y_select.getSelectedIndex());
                int windowWidth = jf.getWidth();
                int winowHeight = jf.getHeight();
                System.out.println(windowWidth+" "+winowHeight);
            }else if(e.getActionCommand().equals("退出")){
                System.exit(0);
            }
        }
    }
    class windowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new setSeat().init();
    }
}
