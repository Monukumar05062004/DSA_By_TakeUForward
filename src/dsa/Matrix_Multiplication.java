package dsa;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        int [][] matrix2=new int[][]{{4,2,-1},{3,2,0}};
        int [][] matrix1=new int[][]{{0,1},{2,3},{7,4}};
        int[][] m=new int[3][3];
        int r1=matrix1.length,c1=matrix1[0].length,r2=matrix2.length,c2=matrix2[0].length,row=0,col=0,sum;
    if(c1==r2){
        while(row<=r1-1){
            col=0;
            while(col<=c2-1){
                int k=0;sum=0;
                for(int j=0;j<=c1-1;j++){
                    sum=sum+matrix1[row][j]*matrix2[k][col];
                    k++;
                }
                m[row][col]=sum;
                col++;
            }
            row++;
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    else System.out.println(" Matrix multiplication is not possible");
    }
}
