import java.util.*;

class RsBundle {
    public static void main(String[] args) {
        Locale locale;
        ResourceBundle rb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your language");
        System.out.println("Press 1 for English");
        System.out.println("Press 3 for Hindi");
        System.out.println("Press 3 for Japanese");
        int langChoice = sc.nextInt();
        if (langChoice == 1) {
            locale =Locale.of("en", "US");
        } else if (langChoice == 2) {
            locale =Locale.of("hi", "IN");
        } else if (langChoice == 3) {
            locale =Locale.of("jp", "JP");
        } else {
            System.out.println("Invalid Choice. default using English");
            locale =Locale.of("en", "US");
        }
        rb = ResourceBundle.getBundle("ResourceBundle", locale);

        System.out.println(rb.getString("getName"));;
    }

}