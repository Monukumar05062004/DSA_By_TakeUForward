package dsa;
import java.util.Scanner;
public class Rectangle_Pattern {
   static void pattern(int n){
        for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
              System.out.print("* ");
          }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int t;
        Scanner ob =new Scanner(System.in);
        t=ob.nextInt();
        for(int i=0;i<t;i++){
            int n;
            n=ob.nextInt();
            pattern(n);
        }
    }
}
