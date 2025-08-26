package Com.DsaByStriver.java;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,1,2,3,4,5};
        int arr2[]=new int[]{2,3,4,4,5};
        int size=arr1.length+arr2.length;
        int NewArray[]=new int[size],temp,count=0;
        NewArray[0]=arr1[0];
        for(int i=1;i<arr1.length;i++){
            for(int j=0;j<=count;j++){
                if(NewArray[j]==arr1[i]){
                    break;
                }else if(j==count){
                    count++;
                    NewArray[count]=arr1[i];
                }
            }
        }
        for(int i=1;i<arr2.length;i++){
            for(int j=0;j<=count;j++){
                if(NewArray[j]==arr2[i]){
                break;
                }else if(j==count){
                    count++;
                    NewArray[count]=arr2[i];
                }
            }
        }
        for(int k=0;k<size;k++){
            System.out.println(NewArray[k]);
        }
    }
}
