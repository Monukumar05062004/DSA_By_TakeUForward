package learnCodeWithDurgaSoftwareSolution;

public class LearnAboutVariable2 {
    //int[] arr=new int[3];
    static int[] arr=new int[3];
    public static void main(String[] args) {
//        LearnAboutVariable2 ob=new LearnAboutVariable2();
//        //null give
//            System.out.println( ob.arr);
//        //Null pointer Exception
//            System.out.println(ob.arr[0]);
        //System.out.println(arr);
        //System.out.println(arr[1]);
        // Local array behaviour  when not initialization error here is variable may not initialized
                //        int[] arr1;
                //        System.out.println(arr1);
                //        System.out.println(arr1[0]);
 // Local array behaviour when initialized
        System.out.println(" Local array behaviour  when initialized ");
        int[] a=new int[3];
        System.out.println(a);
        System.out.println(a[2]);
    }
}
