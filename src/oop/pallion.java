package oop;

public class pallion {
    //str = str.replaceAll("[^a-zA-Z0-9]", "");
    static void reverse(String str,int indx,int size){
       if(size-1==indx) {
           System.out.println("yes our str is  Palindrome");
           return;
       }
       if(str.charAt(indx)==str.charAt(size-1)){
           reverse(str,indx+1,size-1);
       }
       else{
           System.out.println("no our str is  Palindrome");
           return;
       }

    }
    public static void main(String[] args) {
        String str="m#onu@@uno@m";
    int size=str.length()/2;
        str = str.replaceAll("[^a-zA-Z0-9]", "");
    reverse(str,0,size);
    }
}