package collectionpack;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Enumeration;
public class collection {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //is hash map contain null key ,yes hash map contain one null key because key in hash map is always unique.
        //Null Key: A HashMap can store only one null key because keys in a HashMap must be unique.
        //Null Values: It can store multiple null values because there are no restrictions on values being null.
        //Null value in hashmap may be more than one.
        map.put(null,null);
        map.put(null,null);
        map.put(null,1);
        map.put("1",null);
        System.out.println(map);
        map.put(null,2);
        System.out.println(map);
        // About HashTable is a legacy class in java used to store key-value pairs, similar to hashmap.
       //1.//HashTable are synchronized , it is characteristics of hashtable class
        // Unlike HashMap,HashTable is thread-safe . All its methods are synchronize, meaning that it can be safely used in multithreaded environment.
        //it makes Hashtable slower in singleThreaded environment.
       //2.//No null keys or values
       //hashtable does not allow null  key or values
        Hashtable<String,String> hashTable=new Hashtable<>();
       // hashTable.put(null,null);
      //  System.out.println(hashTable); Null pointer exception. Take care you must not insert any null value in hashtable.
        hashTable.put("1","1");
        System.out.println(hashTable);
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put("apple",2);
        table.put("Banana",3);
        table.put("orange",10);
        Enumeration<String> enu=table.keys();
        while(enu.hasMoreElements()){
            String key=enu.nextElement();
            System.out.println(key+":"+table.get(key));
        }
    }
}
