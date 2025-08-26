package Com.DsaByStriver.java;

public class fac {
    static int fact=1;
    static int factorial(int n){

        if(n<=0){
           return 1;
        }
        fact=fact*n;
        factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
