public class Keithno {
    static boolean isKeith(int num,int len){
        int mynum=num;
        int arr[]=new int[len];
        int i=len-1;
        while (num>0) {
          arr [i]=num%10;
          num/=10;
          i--; 
        }
        int sum=0;
        while (sum<mynum) {
            sum=0;
            for(int k=0;k<len;k++){
                sum+=arr[k];
            }
            if(sum==mynum){
                return true;
            } 
            for(int j=0;j<len-1;j++){
             arr[j]=arr[j+1];
            }
            arr[len-1]=sum;
        }
            return false;
    }
    public static void main(String[] args) {
        boolean result=isKeith(742,3);
        System.out.println(result);
    }
}
