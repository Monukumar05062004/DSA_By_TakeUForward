package oop;

public class insertion {
    public static void main(String[] args) {
        int arr[]={12,1,2,10,1},i,j,smallest;
        for(i=1;i<arr.length;i++){
           smallest=arr[i];
           j=i-1;
           while(j>=0&&smallest<arr[j]){
            arr[j+1]=arr[j];
            j--;
           }
           arr[j+1]=smallest;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
