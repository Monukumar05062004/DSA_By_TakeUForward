package dsa_by_shradha;

public class String_reversal {
   static void  reverse(String name,int indx){
       if(indx==-1)
           return;
       System.out.print(name.charAt(indx));
       reverse(name,indx-1);
   }
    public static void main(String[] args) {
        String name="Dum";
        int size=name.length();
        reverse(name,size-1);
    }
}
