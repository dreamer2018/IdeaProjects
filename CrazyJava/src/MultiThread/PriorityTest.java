package MultiThread;



/**
 * Created by zhoupan on 15-12-16.
 */
public class PriorityTest extends Thread{
    public PriorityTest(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 50 ; i++) {
            System.out.println(getName()+",优先级是："+getPriority()+",循环变量值为："+i);
        }
    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        for (int i = 0; i < 30; i++) {
            if(i==10){
                PriorityTest low = new PriorityTest("低级");
                low.start();
                //设置为最低优先级
                System.out.println("创建之初的优先级:"+low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if(i==20){
                PriorityTest high= new PriorityTest("高级");
                 high.start();
                System.out.println("创建之初的优先级:" + high.getPriority());
                //设置为最高优先级
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
