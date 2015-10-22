import javax.swing.*;

/**
 * Created by zhoupan on 10/21/15.
 */
public class Test {
    public static void main(String[] args){
       // GetSet gt= new GetSet("Bob");
       // GetSet gt=new GetSet("Bob", 1001, true, 80);
       // gt.setId(1002);
       // gt.setScore(92);
       // gt.setSex(false);
       // gt.toString();
        StaticTest st=new StaticTest();
        String s1=JOptionPane.showInputDialog(null,"请输入a：","100");
        String s2=JOptionPane.showInputDialog(null,"请输入b：","200");
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        /*
        int max=st.Max(a,b);
        int min=st.Min(a,b);
        JOptionPane.showMessageDialog(null,"max="+max+" min="+min);
        */
        JOptionPane.showMessageDialog(null,StaticTest.Max(a, b));
    }
}
