import java.util.Scanner;
import java.util.Random;
class game 
{  
    static int n;
    static int input,count=0;
    static Random rand=new Random();
    static int comp=rand.nextInt(100);
    static Scanner sc=new Scanner(System.in);
    public static void takeuserinput()
    {
     System.out.println("enter the number:");
     n=sc.nextInt();
    }
    public static boolean iscorrectnumber()
    {count++;
     if(n==comp)
     {
        System.out.println("correct answer");
        return true;
     }
     else if(n<comp)
     {
        System.out.println("think of a bigger number");
        return false;
     }
     else
     {
        System.out.println("think of a smaller number");
        return false;
     }
    }
    public static int noofguesses()
    {
        return count;
    }
    
    public static void main(String[] args) {
      boolean b=false;
     while(!b){
      takeuserinput();  
      b=iscorrectnumber();}   
      System.out.println("the number of guesses are:"+noofguesses()); 
    }
}