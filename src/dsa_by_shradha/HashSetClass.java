package dsa_by_shradha;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(13);
        set.add(1);
        set.add(15);
        System.out.println(set.contains(1));
//        System.out.println(set);
//        set.remove(12);
//        System.out.println(set);
        Iterator it=set. iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }
    }
}
