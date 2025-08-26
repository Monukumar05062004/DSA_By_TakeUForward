package Com.DsaByStriver.java;
import java.util.*;
public class ReverseAnArray {
    static void reverseArray(int index,int[] arr){
        if(index<0){
            return;
        }
        System.out.print(arr[index]+" ");
        reverseArray(index-1,arr);
    }
    public static void main(String[] args) {
//        int[] arr=new int[]{2,3,1,5,6,7,12};
//        int index=arr.length-1;
//        System.out.println("Value of array before reverse");
//        for(int i=0;i<=index;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Value of array after reverse");
//        reverseArray(arr.length-1,arr);
//        String s=" Monu   @ 123 # ";
//        String s1=s.replaceAll("[^A-Za-z0-9]","Kumar");
//        System.out.println(s1);
        HashMap<Integer,Integer> map=new HashMap();
        map.put(1,1);
        map.put(1,1);
        map.put(2,1);
        map.put(3,4);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }
    }
}
