package Com.DsaByStriver.java;
import java.util.Scanner;
public class Recursion {

    static void fun(int i,int sum){
//        if(n==0){
//            return;
//        }
//        n--;
//        count++;
//        fun(n,count);
//        System.out.print(count--+" ");
        if(i<=0){
            System.out.println(sum);
            return ;
        }
        sum+=i;
        fun(i-1,sum);

    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       int n =ob.nextInt();
        fun(n,0);

    }
}
