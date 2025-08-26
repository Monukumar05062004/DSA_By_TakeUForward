package oop;

class Shape{
   public void printArea(){
       System.out.println("Area is :");
   }
}
class Triangle extends Shape{
    int b,h;
    public void triangleArea(){
        System.out.println(.5*(b*h));
    }
}
public class oops_pillar {
   public  int a;
    public static void main(String[] args) {
        Triangle ob=new Triangle();
        ob.b=12;
        ob.h=20;
        ob.printArea();
        ob.triangleArea();
    }
}
