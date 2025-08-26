package Com.DsaByStriver.java;

public class LongSubArraySum {
   static void   sum(int a[],int num){
       int size=a.length;
       int sum,length;
               length=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                   sum=sum+a[k];
                } if(sum==num){
                    length=Math.max(length,j-i+1);
                }
            }
        }
       System.out.println("Max length of a sub array "+length);
    }
    public static void main(String[] args) {
        sum(new int[]{1,1,1,2,1,1,2,2,1,3},3);
    }
}
