public class AccountDeposit implements Runnable {
    private final Account account;

    public AccountDeposit(Account account, float money) {
        this.account = account;
    }
    public void run() {
        account.deposit(100f);

    }
}
