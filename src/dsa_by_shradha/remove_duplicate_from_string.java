package dsa_by_shradha;

public class remove_duplicate_from_string {
   public  static boolean []map=new boolean[26];
   static void  remove_duplicate(String str,int indx,String newstring){
       if(indx==str.length()){
           System.out.println(newstring);
           return;
       }
      char current_char =str.charAt(indx);
     if(!map[current_char-'a']){
         newstring+=current_char;
         map[current_char-'a']=true;
     }
       remove_duplicate(str,indx+1,newstring);
    }
    public static void main(String[] args) {
        String str="abbbcda";
        remove_duplicate(str,0,"");
    }
}
