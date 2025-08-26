package Com.DsaByStriver.java;

import java.util.Scanner;

public class ReverseAArray {
    static void reverse(int a[],int i,int size){
        if(i>=size){
            return ;
        }int temp=a[i];
        a[i]=a[size];
        a[size]=temp;
        reverse(a,i+1,size-1);
    }
    public static void main(String[] args) {
        int a[]=new int[5],size;
        Scanner ob=new Scanner(System.in);
        size=a.length;
        for(int i=0;i<size;i++){
            a[i]=ob.nextInt();
        }
        reverse(a,0,size-1);
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
