import java.util.ArrayList;
import java.util.List;
public class collectionByAnujBhaiya {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(11);
        list1.add(22);
        list.addAll(list1);
        System.out.println(list);
    }
}
