package Com.DsaByStriver.java;

public class BinarySearch {
   static boolean search(int a[],int low,int high,int target){
        int mid;
       while(low<=high){
           mid=(low+high)/2;
           if(a[mid]==target){
               return true;
           }else if(a[mid]<target){
               low=mid+1;
           }else high=mid-1;
       }

       return false;
    }
    public static void main(String[] args) {
        int a[]=new int[]{2,4,5,6,7};
        int low,high;
        low=0;
        high=a.length-1;
        System.out.println(search(a,low,high,3));
    }
}
