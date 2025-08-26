package dsa;

public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<=i||j>=2*n-1-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<2*n;j++){
                if(j<n-1-i||j>n+i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
