/**
 * Created by zhoupan on 15-12-22.
 */
public class Month {

    private final String month;

    private Month(String month){
        this.month=month;
    }

    public static final Month A = new Month("A");
    public static final Month B = new Month("B");
    public static final Month C = new Month("C");
    public static final Month D = new Month("D");

    public static Month getMonth(int monthNum){
        switch(monthNum){
            case 1:
                return A;
            case 2:
                return B;
            case 3:
                return C;
            case 4:
                return D;
            default:
                return null;
        }
    }
    public String getMonth(){
        return this.month;
    }
    public static void main(String[] args){
        Month m=Month.getMonth(4);
        System.out.println(m.getMonth());
        System.out.println(Month.A.month);
    }
}
