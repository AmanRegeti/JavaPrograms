public class AccountGet implements Runnable {
    private final Account account;

    public AccountGet(Account account) {
        this.account = account;
    }
    public void run() {
        float money = account.get();
        System.out.println("AccountGet thread - money in account: "+money);
    }
}
