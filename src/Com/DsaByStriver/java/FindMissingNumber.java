package Com.DsaByStriver.java;
import java.util.HashMap;
public class FindMissingNumber {
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,3,4,};
        //Create map to store frequency of key
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:a){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else map.put(key,1);
        }
        //map.keySet() method help in finding value corresponding key. then you must provide it (keySet()) a key
        for(int key:map.keySet()){
            if(map.get(key)==1) {
                System.out.println("Element " + key + " occur only one time");
            }
        }
       if(a.length==0) System.out.print("Please enter a valid array");
    }
}
