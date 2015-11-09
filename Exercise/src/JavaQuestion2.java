/**
 * Created by zhoupan on 15-11-9 下午5:36.
 */

import java.util.Scanner;

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String name, String symbol, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.symbol = symbol;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }
}
public class JavaQuestion2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stock s=new Stock(scanner.next(),scanner.next(),scanner.nextDouble(),scanner.nextDouble());
        System.out.printf("%.2f%%",100*s.getChangePercent());
    }

}
