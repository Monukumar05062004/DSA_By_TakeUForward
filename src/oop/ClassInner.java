package oop;
class Outer{
    int i;
    public void display(){
        System.out.println("i is="+i);
    }
    public class Inner{
        int j;
        public Inner(){
            System.out.println(j);
        }
    }
}

public class ClassInner {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.i=10;
        o.display();
        Outer.Inner i=o.new Inner();
        i.j=19;
    }
}
