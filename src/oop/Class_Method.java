package oop;
class Display{
    static void print(){
        System.out.println("e");
    }
}
public class Class_Method {
    static void print(){
        System.out.println("d");
    }
    public static void main(String[] args) {
        System.out.println("c");
        print();
        Display.print();
    }
}
