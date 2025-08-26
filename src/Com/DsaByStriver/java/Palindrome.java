package Com.DsaByStriver.java;

public class Palindrome {
    static boolean check(char a[],int i,int size){
        if(i>=size/2){
            return true;
        }
        if(a[i]!=a[size-1-i]){
            return false;
        }
       return check(a,i+1,size);
    }
    public static void main(String[] args) {
        char a[]=new char[]{'m','o','n'};
        int size=a.length;
        System.out.println(check(a,0,size));
    }
}
