public class Happyno {
    static boolean isHappyno(int num){
        int flag=0;
        while(num>9){
            int squaresum=0;
                while (num>0){
                    int rem=num%10;
                    num/=10;
                    squaresum=squaresum+rem*rem;
                }
                num=squaresum;
            if(squaresum==1){
                flag=1;
                break;
            }
        }
        if(flag==1){
        return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result=isHappyno(31);
        System.out.println(result);
    }
}
