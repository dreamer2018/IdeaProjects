
/**
 * Created by zhoupan on 12/10/15.
 */
interface Product{
    public double getPrice();
    public String getName();
}
public class AnonymousTest {
    public void test(Product p){
        System.out.println("Buy a"+p.getName()+" cost "+p.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest ta=new AnonymousTest();
        ta.test(new Product() {
            @Override
            public double getPrice() {
                return 3200;
            }

            @Override
            public String getName() {
                return "computer";
            }
        });
    }
}
