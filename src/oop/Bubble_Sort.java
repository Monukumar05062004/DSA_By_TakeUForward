package oop;

import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
     int arr[]=new int[10],temp;
     Scanner in=new Scanner(System.in);
        System.out.println("Enter max 10 value in array ");
        for(int i=0;i<10;i++){
            arr[i]=in.nextInt();
        }
        for(int j=0;j<10-1;j++){
            for(int k=0;k<10-1-j;k++){
               if(arr[k]>arr[k+1]){
                   temp=arr[k];
                   arr[k]=arr[k+1];
                   arr[k+1]=temp;
               }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
