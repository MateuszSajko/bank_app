import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Welcome to our Bank app \n");
        System.out.println("Create an account \n");
        account.createAccount();
         int op;
             do {
                 System.out.println("What kind of operation you are interested in? \n 1. Account information \n 2. Payment on account \n 3. Withdrawal from the account \n 4. Exit");
                 op = scann.nextInt();
                 switch(op) {
                     case 1:
                         account.showAccount();
                         break;
                     case 2:
                         account.deposit();
                         break;
                     case 3:
                         account.withdrawal();
                         break;
             }
         } while(op != 4);
    }
}
