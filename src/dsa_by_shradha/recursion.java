package dsa_by_shradha;
import java.util.Scanner;
// print 1 to 5 using recursion
public class recursion {
    static int sum=0;
    static int print(int i, int n){

        if(i>n)
            return 1;
       sum=sum+i;
        print(i+1,n);
        System.out.println(" "+i);
        return sum;
    }
    public static void main(String[] args) {
        int i=1,n;
        System.out.println("Enter a no n");
        Scanner ob =new Scanner(System.in);
        n=ob.nextInt();
        System.out.println(print(i,n));
    }
}
