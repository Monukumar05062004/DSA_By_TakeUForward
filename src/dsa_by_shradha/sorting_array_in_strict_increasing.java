package dsa_by_shradha;
public class sorting_array_in_strict_increasing {
   static boolean check_sorting(int arr[],int indx){
       if(indx==arr.length-1)
           return true;
        if(arr[indx]<arr[indx+1]){
           return (check_sorting(arr,indx+1));
        }else
            return false;
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,4,5,6};
        boolean result=check_sorting(arr,0);
        System.out.println(result);
    }
}
