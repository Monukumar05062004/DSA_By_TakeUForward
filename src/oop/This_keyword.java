package oop;

class pen{
    String color;
    String type;
//    void pen_fun(){
//        System.out.println("writing your name");
//    }
//    void pen_character(){
//        System.out.println("oop.pen "+ color+" and type "+type);
//    }
    pen(String color,String type){
      //  System.out.println("Constructor is created ");
        this.color=color;
        this.type=type;
        System.out.println("oop.pen "+color+" type "+type);
    }
}
public class This_keyword {
    public static void main(String[] args) {
//     oop.pen pen1=new oop.pen();
//     pen1.color="Red";
//     pen1.type="Ball";
//     pen1.pen_fun();
//     pen1.pen_character();
//     oop.pen pen2 =new oop.pen();
//     pen2.color="blue";
//     pen2.type="Gel";
//     pen2.pen_character();
        pen ob=new pen("red","gel");
    }
}
