package Com.DsaByStriver.java;

import java.util.HashMap;
public class LongSubArrayUsiHashing {
    static void longestSubArraySum(int a[],int k){
        HashMap<Integer,Integer> hash=new HashMap<>();
        int size=a.length;
        int sum,length;
        sum=length=0;
        for(int i=0;i<size;i++){
            sum+=a[i];
            if(sum==k){
                length=i+1;
            }
            if(sum>k){
                if(hash.containsKey(sum-k)){
                    length=Math.max(length,i-hash.get(sum-k));
                }
            }
            hash.put(sum,i);
        }
        System.out.println("Max length "+length+" sub array whose sum equal to "+k);
    }
    public static void main(String[] args) {
    int arr[]=new int[]{1,2,1,4,3,7};
    int k=4;
    longestSubArraySum(arr,k);
    }
}
