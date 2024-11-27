import java.util.HashSet;
class subsequences{
    void subsequences(String str,int index,String newstr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
       char currchar=str.charAt(index);
       //to be 
       subsequences(str, index+1, newstr+currchar,set);
       //not to be
       subsequences(str,index+1,newstr,set);
    }
public static void main(String[] args) {
    subsequences obj=new subsequences();
    String s="aaa";
    System.out.println("the subsequences are:");
    HashSet<String> set=new HashSet<>();
    obj.subsequences(s,0,"",set);
}
}