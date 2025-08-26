package oop;//abstraction and data hiding
//1 abstraction means hiding the unnecessary information from user using access modifier (public,default,protected,private )
//2 data hiding done by encapsulation

import oop.oops_pillar;
public class opps {
    public static void main(String[] args) {
        oops_pillar   ob1=new oops_pillar();
       ob1.a=12;
        System.out.println("oop.opps class access a field from a package oop value is o"+ob1.a);
    }
}
