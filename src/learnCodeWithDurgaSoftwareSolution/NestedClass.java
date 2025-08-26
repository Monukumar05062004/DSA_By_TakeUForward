package learnCodeWithDurgaSoftwareSolution;

public class NestedClass {
    //private, protected, and public help to improve the  encapsulation
    //Non-static class is called as inner class
    //static class is called as nested class.
    public static  class Inner{
        String city="Luckwnow";
        Inner(){
            System.out.println("This is a inner constructor");
        }
    }


    public static void main(String[] args) {
      NestedClass.Inner ob=new   NestedClass.Inner();

    }
}
