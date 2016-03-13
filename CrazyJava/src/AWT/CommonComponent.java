package AWT;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2016/3/13.
 */
public class CommonComponent {
    Frame f = new Frame("测试窗口");
    Button ok = new Button("确认");
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox male = new Checkbox("男",cbg,true);
    Checkbox female = new Checkbox("女",cbg,false);
    Checkbox married = new Checkbox("是否已婚？",false);
    Choice colourChooser = new Choice();
    List colourList = new List(6,true);
    TextArea ta = new TextArea(5,20);
    TextField name = new TextField(50);
    public void init(){
        colourChooser.add("红色");
        colourChooser.add("绿色");
        colourChooser.add("蓝色");
        colourList.add("红色");
        colourList.add("绿色");
        colourList.add("蓝色");
        Panel bottom = new Panel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom,BorderLayout.SOUTH);
        Panel checkPanel = new Panel();
        checkPanel.add(colourChooser);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(checkPanel);
        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colourList);
        f.add(top);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CommonComponent().init();
    }
}
