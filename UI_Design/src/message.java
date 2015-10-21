/**
 * Created by zhoupan on 9/12/15.
 */
import sun.plugin2.message.Message;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class message {
    public static void main(String[] args){
        String s=JOptionPane.showInputDialog(null,"请输入你的生日：");
        int n=JOptionPane.showConfirmDialog(null,"Are You Sure?");
        if(n==0)
            JOptionPane.showMessageDialog(null,s);
        else if(n==1)
            JOptionPane.showMessageDialog(null,"No........");
        else
            JOptionPane.showMessageDialog(null,"Cancel");
    }
}
