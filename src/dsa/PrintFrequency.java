package dsa;
import java.util.HashMap;
public class PrintFrequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap();
        int arr[]=new int[]{1,2,1,3,4,5,2,4,5};
        map.put(arr[0],1);
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                val++;
                map.put(arr[i],val);
            }
           else{
                map.put(arr[i],1);
            }
        }
        for(int val: map.keySet()){
            System.out.println("Frequency of "+val+"is "+map.get(val));
        }
    }
}
