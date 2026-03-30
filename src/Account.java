public class Account {
    private float  money;
    public Account(float money) {
        this.money = money;
    }

    synchronized public void withdraw(float MoneyWithdraw) throws InterruptedException {
            float MoneyLeft= money - MoneyWithdraw;
            System.out.println("You just withdrew" + MoneyWithdraw);
            money = MoneyLeft;
            Thread.sleep(1000);
            System.out.println("You have " + money + " dollars left in your account after withdrawal");
        }
    synchronized public void deposit(float MoneyDeposited){
            float TotalMoney= money + MoneyDeposited;
            System.out.println("You just deposited" + MoneyDeposited);
            money = TotalMoney;
            System.out.println("You have " + money + " dollars left in your account after deposit");
        }
    synchronized public float get() {
            return money;
        }


}
