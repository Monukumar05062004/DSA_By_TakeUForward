package dsa;
import java.util.Scanner;
public class HallowPatternOfRightAngleTriangle {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<=n-1-i||j>n-1+i){
                    System.out.print("* ");
                }
                else   System.out.print("  ");
                    
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*n);j++){
                if(j<=i||j>=(2*n)-1-i){
                    System.out.print("* ");
                }  else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int t;
        Scanner ob =new Scanner(System.in);
        t=ob.nextInt();
        for(int i=0;i<t;i++){
            int n=ob.nextInt();
            pattern(n);
        }
    }
}
