package MultiThread;

/**
 * Created by zhoupan on 15-12-16.
 */
public class Account {
    // 余额
    private int balance = 500;

    // 检查余额
    public int getBalance() {
        return balance;
    }
    // 取款
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
