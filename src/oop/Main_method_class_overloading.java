package oop;
public class Main_method_class_overloading {
    public static void main(int a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        int a=12;
        System.out.println(args[0]);
        System.out.println(args[1]);
        Main_method_class_overloading.main(a);
    }

}
