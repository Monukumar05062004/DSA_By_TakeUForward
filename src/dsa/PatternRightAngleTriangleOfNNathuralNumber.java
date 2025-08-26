package dsa;
import java.util.Scanner;
public class PatternRightAngleTriangleOfNNathuralNumber {
    static void patternOfNaturalNo(int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(++count+" ");
            }
            System.out.println();
        }
    }
    static void patternOfAlphabate(int n){
        char count;
        for(int i=0;i<n;i++){
            count='A';
            for(int j=0;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int t;
        Scanner ob=new Scanner(System.in);
        t=ob.nextInt();
        for(int i=0;i<t;i++){
            int n;
            n=ob.nextInt();
            //patternOfNatural(n);
            patternOfAlphabate(n);
        }
    }
}
