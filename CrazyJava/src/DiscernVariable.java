/**
 * Created by zhoupan on 12/1/15.
 */
public class DiscernVariable {
    private String prop="外部类的实例变量";

    private class InnerClass{
        private String prop="内部类的实例变量";
        public void printInfo(){
            String prop="局部变量的属性值";
            System.out.printf("外部类的属性值：%s\n", DiscernVariable.this.prop);
            System.out.printf("内部类的属性值：%s\n",this.prop);
            System.out.printf("局部变量的属性值：%s\n",prop);
        }
    }
    public void test(){
        //InnerClass ic = new InnerClass();
        //ic.printInfo();
        new InnerClass().printInfo();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}

