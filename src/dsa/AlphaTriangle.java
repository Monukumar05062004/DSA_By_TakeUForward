package dsa;

public class AlphaTriangle {
    public static void alphaTriangle(int n) {
        // Write your code here
//        char var;
//        var=(char)n;
        for(int i=0;i<n;i++){
            char var1='A';
            for(int j=0;j<=i;j++){
                var1= (char) (var1+n);
                System.out.print((var1--)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        alphaTriangle(n);
    }
}
