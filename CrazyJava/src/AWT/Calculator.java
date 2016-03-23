import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by sel on 15-12-18.
 */
public class Calculator {

    int signal;
    double number1,number2,result;
    Button Add = new Button("Add");
    Button Subtract = new Button("Subtract");
    Button Multiply = new Button("Multiply");
    Button Divide = new Button("Divide");

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.drawView();
        c.result=c.Count(c.number1,c.number2);
        System.out.println(c.result);
    }
    public  double Count(double number1,double number2){
        switch (signal){
            case 1 :
                return number1+number2;
            case 2 :
                return number1-number2;
            case 3 :
                return number1*number2;
            case 4 :
                return number1/number2;
            default:
                return 0;
        }
    }
    private void drawView() {
        Frame f = new Frame("Calculator");
        f.setLayout(new BorderLayout(30, 5));
        f.setBounds(30, 30, 250, 120);
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.add(new Label("Number 1"));
        p1.add(new TextField(10));
        p1.add(new Label("Number 2"));
        p1.add(new TextField(10));
        p1.add(new Label("Result"));
        p1.add(new TextField(10));
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));
        p2.add(Add);
        p2.add(Subtract);
        p2.add(Multiply);
        p2.add(Divide);
        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
        ButtonListener listener=new ButtonListener();
        Add.addActionListener(listener);
        Subtract.addActionListener(listener);
        Multiply.addActionListener(listener);
        Divide.addActionListener(listener);
    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Add) {
                signal = 1;
            }
            if (e.getSource() == Subtract) {
                signal = 2;
            }
            if (e.getSource() == Multiply) {
                signal = 3;
            }
            if (e.getSource() == Divide) {
                signal = 4;
            }
        }
    }
}
