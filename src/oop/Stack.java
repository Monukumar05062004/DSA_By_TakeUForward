package oop;

import java.util.Scanner;

public class Stack {
   // static int top=-1;
    static int push(int a[],int top){
        Scanner ob =new Scanner(System.in);
        if(a.length-1==top){
            System.out.println("over flow");
        }else {
        System.out.println("Enter a element ");
        top++;
        a[top]=ob.nextInt();
        }
        return top;
    }
    static void display(int a[],int top){
        for(int i=top;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    static int pop(int a[],int top){
        if(top==-1){
            System.out.println("under flow");
            return top;
        }
        else {
            System.out.println("Element deleted at index is"+top);
            return  top--;
        }
    }
    static void peek(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]=new int[5];
        int top=-1;

        top=push(a,top);
        top=push(a,top);
        display(a,0);
        top= pop(a,top);

    }
}
