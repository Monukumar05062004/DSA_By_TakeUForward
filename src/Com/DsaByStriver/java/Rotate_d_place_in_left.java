package Com.DsaByStriver.java;

public class Rotate_d_place_in_left {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,5,6};
        int size=arr.length,d=3,d1=d;
        int NewArray[]=new int[size];
        for(int i=d;i<=size-1;i++){
            NewArray[i-d]=arr[i];
        }
        while(d>0){
            NewArray[size-d]=arr[d1-d];
            d--;
        }
        for(int k=0;k<=size-1;k++){
            System.out.print(NewArray[k]+" ");
        }
    }
}
