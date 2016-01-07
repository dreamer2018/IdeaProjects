package MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhoupan on 15-12-17.
 */
class MyThread implements Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "的i值为：" + i);
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) throws Exception{
        //创建一个具有6个线程的线程池
        ExecutorService pool= Executors.newFixedThreadPool(6);
        //向线程池中提交两个线程
        pool.submit(new MyThread());
        pool.submit(new MyThread());
        //关闭线程
        pool.shutdown();
    }
}