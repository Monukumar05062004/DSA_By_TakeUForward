import java.util.Arrays;

class Solution {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int k1=k;
        if(nums.length==1){
            return 1;
        }
        int maxcount=0;
        for(int i=nums.length-1;i>=0;i--){
            int j=i-1;
            int currentcount = 1;
            k1=k;
            while(k1>0 && j>=0){
                int diff = nums[i]-nums[j];
                if(diff<=k1){
                    k1 = k1 - diff;
                    currentcount++;
                }
                j--;
            }
            maxcount = currentcount>maxcount?currentcount:maxcount;
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(arr,5));
    }
}