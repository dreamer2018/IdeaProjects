/**
 * Created by zhoupan on 9/22/15.
 */
import javax.swing.JOptionPane;
import java.util.*;

public class question3 {
    static void Print(int year,String mon_name,int month,int week){
        System.out.println("\n\t\t\t\t"+mon_name+"\t"+year);
        System.out.println("___________________________________________________\n");
        System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");
        for(int i=1;i<=month+week;i++){
            if(i<=week){
                System.out.printf("%3s\t\t","   ");
            }
            else{
                System.out.printf("%3d\t\t", i-week);
            }
            if(i%7==0){
                System.out.println("");
            }
        }
        System.out.println("\n___________________________________________________");
    }
    public static void main(String[] args){

        String str=JOptionPane.showInputDialog(null,"请输入年份:","2015");
        int year=Integer.parseInt(str);

        str=JOptionPane.showInputDialog(null,"请输入一月一日为周几：","4");
        int week=Integer.parseInt(str);
        int[] month; //数组用于记录每个月的天数
        int total=0;   //记录一年的总天数
        if(((year/4)==0&&(year/100!=0))||(year/400==0)){
            month=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        }
        else{
            month=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        }
        String[] mon_name=new String[]{"January","Febrary","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<12;i++){
            total+=month[i];
        }
        for(int i=0;i<12;i++){
            Print(year, mon_name[i], month[i], week);
            week=(month[i]%7+week)%7;
        }
    }
}
