package Com.DsaByStriver.java;

public class LearnRecursion {
   static  int count=0;
    static void print(int n){

        if(count==n) return;
        System.out.println(count);
        count++;
        print(n);
        System.out.println("count");
    }
    public static void main(String[] args) {
        int n=3;
        print(n);
    }
}
