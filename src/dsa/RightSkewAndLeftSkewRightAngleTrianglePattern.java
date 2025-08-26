package dsa;
import java.util.Scanner;
public class RightSkewAndLeftSkewRightAngleTrianglePattern {
    static void pattern(int n){
        int count=0,c_s=1,check;
                for(int i=0;i<n;i++){
                    count=0;c_s=1;
                   for(int j=0;j<2*n;j++){
                       if(j<=i||j>=(2*n)-1-i){
                           if(c_s==1)
                           {
                               System.out.print(++count+" ");
                               if(count==n){
                                  c_s=0;
                               }
                           }else  System.out.print(count--+" ");
                       }else
                       {
                           c_s=0;
                           System.out.print("  ");
                       }
                   }
                    System.out.println();
                }
    }
    public static void main(String[] args) {
        int t;
        Scanner ob=new Scanner(System.in);
        t=ob.nextInt();
        for(int i=0;i<=t;i++){
            int n;
            n=ob.nextInt();
            pattern(n);
        }
    }
}
