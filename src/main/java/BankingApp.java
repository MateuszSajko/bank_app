import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w naszej aplikacji bankowej");
        System.out.println("Utworz nowe konto");
        account.createAccount();
         int op;
             do {
                 System.out.println("Jaka operacja Cie interesuje \n 1. Informacje ogolne \n 2. Wplata na konto \n 3. Wyplata gotowki \n 4. Wyjscie");
                 op = scann.nextInt();
                 switch(op) {
                     case 1:
                         account.showAccount();
                         break;
             }
         } while(op != 4);
    }
}
