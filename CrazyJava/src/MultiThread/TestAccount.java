package MultiThread;

/**
 * Created by zhoupan on 15-12-16.
 */

public class TestAccount implements Runnable {
    // 所有的用此TestAccount对象创建的线程共享同一个线程
    private Account acct = new Account();
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(100); // 取款
            if (acct.getBalance() < 0) 	System.out.println("账户透支了!");
        }
    }
    private void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()+"准备取款");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {			}
            acct.withdraw(amt); // 如果余额足够，则取款
            System.out.println(Thread.currentThread().getName() + " 完成取款");
        } else {// 余额不够给出提示
            System.out.println("余额不足以支付 " + Thread.currentThread().getName() + " 的取款，余额为 " + acct.getBalance());
        }
    }
}
