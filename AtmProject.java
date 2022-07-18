package ATM_Complete_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        ArrayList<Bank> mem = new ArrayList<>();
        mem.add(new Bank(1234, 10000, "Divagar"));
        mem.add(new Bank(2345, 15000, "Abisheak"));
        mem.add(new Bank(3456, 18000, "Ajim"));
        mem.add(new Bank(4567, 25000, "Kalaivanan"));

        int bal;
        int addAmount = 0;
        int takeAmount = 0;

        System.out.println("....Welcome your mini ATM....");
        System.out.println("please Enter your pin");
        Scanner sc = new Scanner(System.in);
        int userPin = sc.nextInt();

        for (Bank b1 : mem) {                //Access for Customer details

            if (b1.verifyPin(userPin)) {
                System.out.println("press 1 to check balance");
                System.out.println("Press 2 to add Amount");
                System.out.println("Press 3 to take Amount");
                System.out.println("Press 4 to take Receipt");
                System.out.println("Press 5 to EXIT");
                while (true) {
                    int userOpt = sc.nextInt();          //User Options
                    switch (userOpt) {
                        case 1 -> {                     //Get Balance
                            bal = b1.getBalance();
                            System.out.println("Your current Balance " + bal);
                        }
                        case 2 -> {                     //Add Amount
                            System.out.println("How much amount did you want to add to your Account?");
                            addAmount = sc.nextInt();
                            b1.addAmount(addAmount);
                        }
                        case 3 -> {                     //Take Amount
                            System.out.println("How much amount did you want to take?");
                            takeAmount = sc.nextInt();
                            b1.takeAmount(takeAmount);
                        }
                        case 4 ->                      //Take Receipt
                                b1.takeReceipt(addAmount, takeAmount);
                    }
                    if (userOpt == 5) {                // EXIT
                        System.out.println("...WELCOME AGAIN...");
                        break;
                    }
                }
            }
        }
    }
}

