/**
 * Created by zhoupan on 9/22/15.
 */
import java.util.Scanner;
public class question1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Loan Amount:");
        double amount=scanner.nextDouble();
        System.out.print("Number of year:");
        int time=scanner.nextInt();
        System.out.print("Annual Interest Rate:");
        double year_rate=scanner.nextDouble();
        double rate=year_rate/12;
        double Mon_pay,Tot_pay,interset,principal,balance=amount;
        Mon_pay=amount*rate/(1-1.0/(Math.pow(1+rate,12*time)));
        Tot_pay=12*time*Mon_pay;
        System.out.printf("Month Payment:%6.2f\n",Mon_pay);
        System.out.printf("Total Payment:%6.2f\n", Tot_pay);
        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance\n");
        for(int i=1;i<=12*time;i++){
            interset=rate*balance;
            principal=Mon_pay-interset;
            balance=balance-principal;
            System.out.printf("%2d\t\t\t\t%6.2f\t\t\t%6.2f\t\t\t%6.2f\n",i,interset,principal,balance);
        }
    }
}
