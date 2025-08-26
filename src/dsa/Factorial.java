package dsa;
public class Factorial {
    //using recursion
//   static int fact(int n){
//        if(n==1||n==0){
//            return 1;
//        }
//        return fact(n-1)*n;
//    }
//    public static void main(String[] args) {
//        int n=5;
//        int result=fact(n);
//        System.out.println(result);
//    }
    //using iteration
    public static void main(String[] args) {
        int n=6,fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
