public class AccountClient {
    public static void main(String[] args) {
        Account account = new Account(500);

        Thread accountWithdraw = new Thread(new AccountWithdraw(account, 100));
        accountWithdraw.start();
        Thread accountGet = new Thread(new AccountGet(account));
        accountGet.start();
        Thread accountDeposit= new Thread(new AccountDeposit(account, 200));
        accountDeposit.start();

        System.out.println("Money in account in main thread : "+account.get());
    }
}
