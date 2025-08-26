package oop;
class Monu {
    int x,y;
}
class MonuJounier extends Monu {
   private int x,y;
    void setval(int x,int y )
    {
        super.x=x;
        super.y=y;
    }
    void display(){
        System.out.println(super .x);
        System.out.println(this .y);
    }
}

public class InheritanceContainSuperAndThisKeyword  {
    public static void main(String[] args) {
       // MonuJounier ob =new MonuJounier();
       // ob.setval(12,23);
      //  ob.setval(12,34);
        MonuJounier ob2=new MonuJounier();
        ob2.setval(12,3);
        ob2.display();
    }
}
