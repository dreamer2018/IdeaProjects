package MultiThread;

/**
 * Created by zhoupan on 15-12-16.
 */
public class SecondThread implements Runnable{
    private int i;
    public void run(){
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <30; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                SecondThread st= new SecondThread();
                new Thread(st,"线程1").start();
                new Thread(st,"线程2").start();
            }
        }
    }
}
