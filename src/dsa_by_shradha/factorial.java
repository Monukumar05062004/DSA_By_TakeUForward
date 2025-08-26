package dsa_by_shradha;


public class factorial {

    static int calculate_fact(int n){
        if(n==1||n==0)
            return 1;
        int  fact_num1=calculate_fact(n-1);
        int  fact_num=n*fact_num1;
       return fact_num;
    }
    public static void main(String[] args) {
        int n=5;
       int ans  =calculate_fact(n);
        System.out.println("fact of"+n+"is"+ans);
    }
}
