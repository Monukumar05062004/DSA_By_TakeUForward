package oop;

public class Bit {
    public static void main(String[] args) {
        //get bit
//        int n=5;//0101
//        int p=2;
//        int new_num=1<<p;
//
//        if((new_num&n)==0) {
//            System.out.println("This pos contain 0");
//        }
//        else{
//                System.out.println("This pos contain 1");
//            }
        //set oop.Bit
        int n=4;    //0100
        int p=0;
        // bit mask 1<<p
        //operation = or
        int bit_mask=1<<p;
        int new_num=(n|bit_mask);
        System.out.println("new no after 1 insert at position "+p+"is "+new_num);
        }
    }

