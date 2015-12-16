package MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by zhoupan on 15-12-16.
 */
public class ThirdThread implements Callable<Integer>{
    public Integer call(){
        int i=0;
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值："+i);
        }
        return i;
    }

    public static void main(String[] args) {
        ThirdThread rt= new ThirdThread();
        FutureTask<Integer> task=new FutureTask<Integer>(rt);
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值："+i);
            if (i==20){
                new Thread(task,"又返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值："+task.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}