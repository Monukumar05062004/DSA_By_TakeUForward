package dsa_by_shradha;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapClass {
    public static void main(String[] args) {
      HashMap<String,Integer>  map=new HashMap<>();
      map.put("Monu",12);
      map.put("sonu",2);
//      map.put("china",2);
      int arr[]={12,13,14,15,1};
//      for(int i=0;i<arr.length;i++){
//          System.out.print(arr[i]+" ");
//      }
//        System.out.println();
//      for(int val:arr){
//          System.out.print(val+" ");
//      }
//      for(Map.Entry<String ,Integer> e:map.entrySet()){
//          System.out.println(e.getKey());
//          System.out.println(e.getValue());
//      }
      Set<String> keys=map.keySet();
      for(String key:keys){
          System.out.println(key+" "+map.get(key));
      }
        System.out.println( map.remove("china"));
        System.out.println(map);
    }
}
