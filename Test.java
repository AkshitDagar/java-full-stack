public class Test {
    public static void main(String[] args) {
        String name = "naman";
        int j = name.length() - 1;
        int flag = 0;
        for (int i = 0; i < j; i++) {
            if (name.charAt(i) != name.charAt(j)) {
                flag = 1;
                break;
            }
            j--;
        }
        if (flag == 0) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
