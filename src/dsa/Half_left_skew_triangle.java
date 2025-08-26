package dsa;

public class Half_left_skew_triangle {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=(n-i)){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            int[] num;//Reference variable
            num=new int[6];
            int[] array=new int[6];
            int[] array1=new int[]{1,2,3,1,3};
        }
    }
}
