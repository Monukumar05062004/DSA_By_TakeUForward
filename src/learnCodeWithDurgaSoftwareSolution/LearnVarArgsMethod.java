package learnCodeWithDurgaSoftwareSolution;

public class LearnVarArgsMethod {
    static void m1(int[]... arr){//int [][]arr
        int count=0;
        for(int[] val: arr){

            System.out.println(val[0]);
            count++;
        }
        System.out.println(count);
    }
    //use of var args m
    static void sum(int... x){
        int sum=0;
      for(int i=0;i< x.length;i++){
          sum=sum+x[i];
      }
        System.out.println(sum);
    }
    static void sum(int x){
        System.out.println("Normal method run "+x);
    }
    public static void main(String... arg) {
//        sum();
//        sum(12);
//        sum(12,14,15);
        m1(new int[]{12,23},new int[]{21,23,34,1});
    }
}
