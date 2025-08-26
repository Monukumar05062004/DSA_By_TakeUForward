package oop;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {
        LinkedList <String>li=new LinkedList();
        li.add("12");
        li.add("15");
        li.add("24");
        li.add("32");
        System.out.println("Element in a linked list ");
        System.out.println(li);
        //delete in linked list
        li.remove(1);
        System.out.println("Element in a linked list after deletion");
        System.out.println(li);
    }
}
