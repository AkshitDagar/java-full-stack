import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> l=new ArrayList<String>();
        l.add("");
        l.add(str.charAt(0)+"");
        for(int i=1;i<str.length();i++){ 
            String temp=str.charAt(i)+"";
            int len=l.size();
            for(int j=0;j<len;j++){
                if(!l.contains(l.get(j)+temp)){
                    l.add(l.get(j)+temp);
                }
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        sc.close();
    }
}
