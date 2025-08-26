package Com.DsaByStriver.java;
import java.util.Scanner;
public class PrintYourNameNTime {
    static int sum=0;
    static void print(int i,int n){
        if(i>n){
            return ;
        }
        sum=sum+i;
        print(i+1,n);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter value of N");
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        print(1,n);
        System.out.println(sum);
    }
}
