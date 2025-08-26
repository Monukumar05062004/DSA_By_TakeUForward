package oop;

public class Class_revision {
    public static void main(String[] args) {
        person p2=new person();
      person p1=new person("monu",23);
      p1.print1();
    }
}
//class is nothing but a blueprint, that is implemented by an object.
class person{
    //properties of a class
   static String name;
   static int age,count=0;

    // it also contains function
     void print1(){
        System.out.println("My name is "+name+" and my age is "+age);
    }
    person(){
         count++;
        System.out.println("Number of time we created a constructor is "+count);
    }
    person(String name,int age){
         this();
        this. name=name;
         this.age=age;
        System.out.println(name+" "+age);
    }
}
