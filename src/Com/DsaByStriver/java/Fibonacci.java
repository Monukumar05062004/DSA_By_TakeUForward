package Com.DsaByStriver.java;

import java.util.Scanner;

public class Fibonacci {
static int  fiboo(int n){
   if(n<=1){
       return n;
   }
   return fiboo(n-1)+fiboo(n-2);
}
    public static void main(String[] args) {

        int f=0,s=1,n;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size number Fibonacci");
        n=ob.nextInt();
        System.out.println(fiboo(n));
    }
}
