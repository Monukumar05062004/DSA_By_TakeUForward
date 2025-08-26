package Com.DsaByStriver.java;

public class Right_Rotate {
    static void swap(int arr[],int f,int l){
        int temp =arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
    public static void main(String[] args) {
        int temp,arr[]=new int[]{1,2,3,4,5,6},d=1,size=arr.length;
        //int NewArray[]=new int[size];
        for(int i=1;i<=size-1;i++){
           swap(arr,0,i);
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
