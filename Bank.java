package ATM_Complete_Project;

public class Bank {
    private final int pin;
    private int balance;
    private final String name;

    Bank(int pin, int balance, String name) {  //initialize the values
        this.pin = pin;
        this.balance = balance;
        this.name = name;
    }

    int getBalance() {                 //Get Balance
        return balance;
    }

    boolean verifyPin(int userPin) {   //PIN verification
        if (userPin == this.pin) {
            System.out.println("your PIN is verified. Welcome " + name);
            return true;
        } else {
            return false;
        }
    }

    void addAmount(int add) {         //Add Amount
        System.out.println("Successfully credited");
        balance += add;
    }

    void takeAmount(int takeAmount) {  //Take Amount
        if (takeAmount > balance) {
            System.out.println("Your balance is insufficient");
            System.out.println("Try less than your available balance");
        } else {
            System.out.println("Successfully taken");
            balance = balance - takeAmount;
        }
    }

    void takeReceipt(int addAmount, int takeAmount) {              //Take Receipt
        System.out.println("Welcome to All in one mini ATM");
        System.out.println("Available balance is " + balance);
        System.out.println("Amount deposited     " + addAmount);
        System.out.println("Amount taken         " + takeAmount);
        System.out.println(".....Thanks for coming.....");
    }
}
