public class Account {
    private float  money=300;
    public static void main(String[] args) {
        Account acc = new Account();
        acc.withdraw(100f);
        acc.deposit(50f);
        float moneyInAcc = acc.get();
        System.out.println(moneyInAcc);
    }
    p
    synchronized public void withdraw(float MoneyWithdraw) {
        Float MoneyLeft= money - MoneyWithdraw;
        System.out.println("You just withdrew" + MoneyWithdraw);
        System.out.println("You have " + MoneyLeft + " dollars left in your account");
        money = MoneyLeft;
    }
    synchronized public void deposit(float MoneyDeposited){
        Float TotalMoney= money + MoneyDeposited;
        System.out.println("You just deposited" + MoneyDeposited);
        System.out.println("You have " + TotalMoney + " dollars in your account");
        money = TotalMoney;
    }
    synchronized public float get() {
        return money;
    }
}
