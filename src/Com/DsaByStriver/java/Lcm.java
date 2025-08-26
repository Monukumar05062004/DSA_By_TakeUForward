package Com.DsaByStriver.java;
//
//import java.util.HashMap;
//
//public class Lcm {
//    static int findLcm(int num1,int num2){
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int result1=0;
//        int result2=0;
//        int check=0;
//        do{
//            int i=0;
//           check= num1<num2?num1:num2;
//            result1=num1*i;
//            map.put(result1,i);
//            result2=num2*i;
//            map.put(result2,i+1);
//            i++;
//        }while(map.containsKey(result1)!=map.containsKey(result2));
//        return result1;
//    }
//    public static void main(String[] args) {
//        System.out.println(findLcm(4,6));
//    }
//}
class Lcm {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Implement your code here
        int n;
        n=5;
        pattern(n);
    }
}