import java.util.Scanner;

public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;
    Scanner scanner = new Scanner(System.in);
    public void createAccount (){
        System.out.println("Enter your account number ");
        accountNumber = scanner.next();
        System.out.println("Enter your account name ");
        name = scanner.next();
        System.out.println("Enter your login");
        login = scanner.next();
        System.out.println("Provide your account balance");
        balance = scanner.nextLong();
    }
    public void showAccount (){
        System.out.println("Your account name is " + name);
        System.out.println("Your account number is " + accountNumber);
        System.out.println("Your account balance is " + balance + "\n");

    }
    public void deposit (){
        System.out.println("Enter ammount of money you want to add to your account ");
        long cashAdd = scanner.nextLong();
        balance = cashAdd + balance;
        System.out.println("Yours current sallary is " + balance +  "\n");
    }

    public void withdrawal() {
        System.out.println("Enter the amount of money you want to withdraw from your account");
        long cashOut = scanner.nextLong();
        if (balance - cashOut < 0) {
            System.out.println("Your account balance after this operation would be negative, choose different ammount \n");}
            else{
                balance = balance - cashOut;
            }

        System.out.println("Your current salary is " + balance +  "\n");

    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}