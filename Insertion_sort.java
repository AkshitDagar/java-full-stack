public class Insertion_sort{
    static void printarr(int [] arr){
        for(int a: arr){
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        int i,j,key;
        int array[]={9,4,7,3,1,6};
        for(j=1;j<array.length;j++){
            i=j-1;
            key=array[j];
            while(i>=0&&key<array[i]){
                array[i+1]=array[i];
                i=i-1;
            }
            array[i+1]=key;
        }
        System.out.println("the sorted array is:");
        printarr(array);
    }
}
