package Com.DsaByStriver.java;

public class Moving_Zero_To_End {
    public static void main(String[] args) {
        int arr[]=new int[]{1,0,2,3,2,0,0,4,5,1},count=0,j=0;
        int NewArray[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }else{
                NewArray[j]=arr[i];
                j++;
            }
        }
        int count1=arr.length;
        while(count!=0){
            NewArray[count1-count]=0;
            count--;
        }
        for(int i=0;i<count1;i++){
            System.out.println(NewArray[i]);
        }
    }
}
