package dsa;
import java.util.Scanner;

public class BinaryPatternInRightAngleTriangle {
    static void printBinarypattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else
                    System.out.print(0+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int t;
        Scanner ob=new Scanner(System.in);
        t=ob.nextInt();
        for(int i=1;i<=t;i++){
            int n;
            n=ob.nextInt();
            printBinarypattern(n);
        }

    }
}
