//bank
//main is called by jvm and jvm is called by jre and jre is called by thread
//leetcode 392
import java.io.PrintStream;
import java.util.Scanner;

class CRUD{
    static int arr[];
    static int size;
    Scanner sc=new Scanner(System.in);
    void Create(){ 
        System.out.println("Enter the size of Array:");
         size=sc.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++){
           System.out.println("Enter the value:");
           arr[i]=sc.nextInt();
        } 
        
    }
    void Read(){
        try{
            PrintStream out=new PrintStream("C:\\Users\\akshi\\OneDrive\\Desktop\\VS code\\myfile.txt");
        for(int i=0;i<size;i++){
        out.println(arr[i]);}
        out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    void Update(){
     System.out.println("Enter the index to be updated:");
     int updateIndex=sc.nextInt();
     System.out.println("Enter the value:");
     int updatedValue=sc.nextInt();
     arr[updateIndex]=updatedValue;
    }
    void Delete(){
        System.out.println("Enter the index to be deleted:");
        int deleteindex=sc.nextInt();
        for(int i=deleteindex;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
    }
    public static void main(String[] args) {
        CRUD crud=new CRUD();
        crud.Create();
        crud.Read();
        crud.Update();
        crud.Delete();
    }
    
}
