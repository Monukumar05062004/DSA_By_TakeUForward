package Com.DsaByStriver.java;

public class Brute_Force_To_Solve_d_Place_Rotation {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6},d=3,size=arr.length;
        d=d%size;
        int NewArray[]=new int[d];
        for(int i=0;i<=d-1;i++){
            NewArray[i]=arr[i];
        }
        for(int i=d;i<size;i++){
            arr[i-d]=arr[i];
        }
        for(int i=size-d;i<size;i++){
            arr[i]=NewArray[i-(size-d)];
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
