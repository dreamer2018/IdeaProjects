package MultiThread;

/**
 * Created by zhoupan on 15-12-16.
 */

/*
    yield()
	该方法与sleep()类似，只是不能由用户指定暂停多长时间，并且yield（）方法只能让同优先级的线程有执行的机会。
 */
public class YieldTest extends Thread{
    public YieldTest(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(getName()+" "+i);
            if(i==20){
                //调用yield()，使当前线程让步
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {

        //启动两个并发的线程
        YieldTest yt1=  new YieldTest("高级");
        YieldTest yt2= new YieldTest("低级");
        //将yt1设置为最高优先级
        //yt1.setPriority(Thread.MAX_PRIORITY);
        //将yt2设置为最低优先级
        //yt2.setPriority(Thread.MIN_PRIORITY);
        yt1.start();
        yt2.start();
    }
}
