public class  AccountWithdraw implements Runnable {
    private final Account account;
    private float money;

    public AccountWithdraw(Account account, float money) {
        this.account = account;
        this.money = money;
    }
    public void run() {

        try {
            account.withdraw(money);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
