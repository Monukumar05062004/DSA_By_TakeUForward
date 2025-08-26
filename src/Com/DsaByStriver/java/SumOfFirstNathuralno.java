package Com.DsaByStriver.java;

import java.util.Scanner;

public class SumOfFirstNathuralno {
    static int sum(int n){
        if(n==0){
           return 1;
        }
        return   n*sum(n-1);

    }
    public static void main(String[] args) {
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        System.out.print(sum(n));
    }
}
