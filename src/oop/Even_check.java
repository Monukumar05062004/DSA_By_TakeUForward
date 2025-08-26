package oop;

import java.util.Scanner;
public class Even_check {
    public static void main(String[] args) {
        int num;
        Scanner ob=new Scanner(System.in);
        num=ob.nextInt();
        if((num&1)==0){
            System.out.println("number is even");
        }
        else System.out.println("no is odd");
    }
}
