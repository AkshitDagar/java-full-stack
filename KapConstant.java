import java.util.Arrays;

public class KapConstant {
   static boolean isKapConstant(int num) {
      if (num<1000 || num>9999) {
         return false;
      }
      int arr[] = new int[4];
      for(int j=0;j<7;j++){
         int i = 0;
         while (num > 0) {
            arr[i] = num % 10;
            num /= 10;
            i++;
         }
        Arrays.sort(arr);  
        int Increasing=0;
        int Decreasing=0;
        int l=3;
        for(int k=0;k<4;k++){
         Decreasing =Decreasing*10+arr[k];
         Increasing=Increasing*10+arr[l];
         l--;
        }
        num=Increasing-Decreasing;
        if(num==6174){
         return true;
        }
      }
      return false;
   }

   public static void main(String[] args) {
      boolean result = isKapConstant(5200);
      System.out.println(result);
   }
}
