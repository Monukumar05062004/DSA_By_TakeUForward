
package dsa_by_shradha;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(0,19);
        l1.add(1,13);
        System.out.println(l1);
//        l1.remove(0);
//        System.out.println(l1);
//        int size=l1.size();
//        System.out.println(size);
//        l1.add(1,12);
//        System.out.println(l1);
//        l1.clear();
//        System.out.println(l1);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(l1.get(1));;
    }
}
