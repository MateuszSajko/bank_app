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
        System.out.println("Your account balance is " + balance);

    }
}
