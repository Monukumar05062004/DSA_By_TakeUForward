package learnCodeWithDurgaSoftwareSolution;


// combination of instance ,static and local variable with primitive,reference variable
public class AboutVariable {
    //instance primitive(system) variable
    int x;
    //instance reference (user define ) variable
    String s="Monu";
    //static instance variable
    static int x1;
    //static reference variable
    static String s1= "Monu Kumar";
    public static void main(String[] args) {
        // Below Gave Error due to illegal start expression

                //        public int num;
                //        private long decimalL;
                //        protected double decVal;
                //        static String str;
                //        transient int [] arr;

        // local variable should be Final
                             final int val;
        // local instance variable
                             int x=10;
        //local reference variable
                            String s= "Sonu Kumar";
    }
}
