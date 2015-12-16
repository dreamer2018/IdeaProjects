package MultiThread;

/**
 * Created by zhoupan on 15-12-16.
 */
public class DaemonThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        DaemonThread dt=new DaemonThread();
        //setDaemon可以将线程设置成后台线程
        dt.setDaemon(true);
        dt.start();
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
