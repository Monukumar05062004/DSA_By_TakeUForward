package oop;
abstract class Student{
    int a;
    abstract void fun();
}
class StudentMonu extends Student {
    int b;
    void fun(){
        System.out.println("class is student monu");
    }
}
public class Abstract {
    public static void main(String[] args) {
        StudentMonu ob=new StudentMonu();
        ob.fun();
    }
}
