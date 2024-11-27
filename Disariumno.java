public class Disariumno {
    static boolean isDisarium(int num,int len){
        int mynum=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=(int)Math.pow(rem,len);
            num/=10;
            len-=1;
        }
        if(sum==mynum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       boolean result= isDisarium(134,3);
       System.out.println(result);
    }
}
