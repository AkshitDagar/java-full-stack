import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Bank {
    static int Bal = 2000;
    static Locale locale;
    static ResourceBundle rb;

    void showBalance() {
        System.out.println(Bal);
    }

    void depositMoney(int amt) {
        Bal += amt;
    }

    int withdrawMoney(int amt) {
        if (Bal < amt) {
            return 0;
        } else {
            Bal -= amt;
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale locale;
        ResourceBundle rb;
        System.out.println("Please choose your language");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Hindi");
        System.out.println("Press 3 for Japanese");
        int langChoice = sc.nextInt();
        if (langChoice == 1) {
            locale = Locale.of("en", "US");
        } else if (langChoice == 2) {
            locale = Locale.of("hi", "IN");
        } else if (langChoice == 3) {
            locale = Locale.of("jp", "JP");
        } else {
            System.out.println("Invalid Choice. default using English");
            locale = Locale.of("en", "US");
        }
        rb = ResourceBundle.getBundle("ResourceBundle", locale);
        System.out.println(rb.getString("greet"));
        Bank bank = new Bank();
        boolean b;
        do {
            System.out.println(rb.getString("service"));
            int serviceChoice = sc.nextInt();
            if (serviceChoice == 1) {
                System.out.println(rb.getString("balance"));
                bank.showBalance();
            } else if (serviceChoice == 2) {
                System.out.println(rb.getString("Depositamt"));
                int Depositamt = sc.nextInt();
                bank.depositMoney(Depositamt);
                System.out.println(rb.getString("success"));
            } else if (serviceChoice == 3) {
                System.out.println(rb.getString("Depositamt"));
                int withdrawamt = sc.nextInt();
                int result = bank.withdrawMoney(withdrawamt);
                if (result == 0) {
                    System.out.println(rb.getString("lessbalance"));
                } else {
                    System.out.println(rb.getString("success"));
                }
            }
            System.out.println(rb.getString("continuation"));
            int continuation = sc.nextInt();
            if (continuation == 0) {
                b = false;
            } else {
                b = true;
            }
        } while (b);

    }
}
