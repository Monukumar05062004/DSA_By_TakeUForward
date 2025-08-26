package dsa_by_shradha;

public class subsequence {
    static void sub(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char current_char=str.charAt(index);
      //included
        sub(str, index+1,newString+current_char);
      //not included
        sub(str, index+1,newString);
    }
    public static void main(String[] args) {
    String str="abc";
    sub(str,0,"");
    }
}
