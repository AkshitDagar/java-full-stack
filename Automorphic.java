public class Automorphic {
    static boolean isAutomorphic(int num){
        int mynum=num;
      int square=num*num;
      int len=0;
      while(num!=0){
        num/=10;
        len ++;
      }
      int squarelast=square%(int)Math.pow(10,len);
      if(squarelast==mynum){
        return true;
      }
      else{
        return false;
      }
    }
    public static void main(String[] args) {
        boolean result=isAutomorphic(25);
        if(result==true){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic"); 
        }
    }
}
