package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        JPanel jp = new JPanel();
    public void init(){
        jf.setSize(300,200);
        confirm.addActionListener(new buttonListener());
        confirm.setSize(60,30);
        exit.addActionListener(new buttonListener());
        exit.setSize(60,30);

        jf.setLayout(new GridLayout());
        jp.setLayout(null);
        hail.setText("请选择影厅：");
        hail.setSize(100,50);

        row_X.setText("    请选择行：");
        row_X.setSize(100,50);
        row_Y.setText("    请选择列：");
        row_Y.setSize(100,50);

        hail_select.setSize(80,20);
        row_X_select.setSize(80,20);
        row_Y_select.setSize(80,20);

        confirm.setLocation(40,120);
        exit.setLocation(180,120);
        hail.setLocation(40,10);
        row_X.setLocation(40,40);
        row_Y.setLocation(40,70);
        hail_select.setLocation(140,23);
        row_X_select.setLocation(140,53);
        row_Y_select.setLocation(140,83);

        jp.add(hail);
        jp.add(hail_select);
        jp.add(row_X);
        jp.add(row_X_select);
        jp.add(row_Y);
        jp.add(row_Y_select);
        jp.add(confirm);
        jp.add(exit);
        jf.addWindowListener( new windowListener());
        jf.add(jp);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setResizable(false);

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
