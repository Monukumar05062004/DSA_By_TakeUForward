package oop;

import java.util.Scanner;
public class selection {
    public static void main(String[] args) {
        int arr[]=new int[10],i,temp, smallest;
        Scanner ob =new Scanner (System.in);
        System.out.println("Enter 10 element in an array");
        for(i=0;i<arr.length;i++) {
            arr[i] = ob.nextInt();
        }
        // sort array using oop.selection sort
        for(int j=0;j<arr.length;j++){
            smallest=j;
            for(int k=j+1;k<arr.length;k++){
               if(arr[smallest]>arr[k]){
                   smallest=k;
               }
            }
             temp=arr[smallest];
            arr[smallest]=arr[j];
            arr[j]=temp;
        }
        for(i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
