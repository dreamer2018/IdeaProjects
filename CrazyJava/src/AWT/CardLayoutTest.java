package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhoupan on 16-3-12.
 */
public class CardLayoutTest {
    Frame f = new Frame("测试窗口");
    String[] names = {"第一张","第二张","第三张","第四张","第五章"};
    Panel p1 = new Panel();
    public void init(){
        final CardLayout c = new CardLayout();
        p1.setLayout(c);
        for (int i = 0; i <names.length ; i++) {
            p1.add(names[i],new Button(names[i]));
        }
        Panel p = new Panel();
        Button previous = new Button("上一张");
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.previous(p1);
            }
        });
        Button next = new Button("下一张");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.next(p1);
            }
        });
        Button first = new Button("第一张");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.first(p1);
            }
        });
        Button last = new Button("最后一张");
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.last(p1);
            }
        });
        Button third = new Button("第三张");
        third.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.show(p1,"第三张");
            }
        });
        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        f.add(p,BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().init();
    }
}
