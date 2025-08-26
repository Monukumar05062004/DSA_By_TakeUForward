package oop;

public class demo {
    public   <T> void genericMethod(T s)
    {
        System.out.println(s);
    }
    static <T> void swap(T num1,T num2){
        T temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("value of num1:"+num1);
        System.out.println("value of num2:"+num2);
    }
    static <V> void varargsMethod(int V[]){
       for(int i=0;i< V.length;i++){
           System.out.print(V[i]+" ");
       }
        System.out.println("first array");
    }
    public static void main(String[] args) {
        int a[]={12,13};
        int b[]={1,2,13,4};
        demo ob=new demo();
      ob.  genericMethod(12);
      ob.  genericMethod(12.0);
      ob.  genericMethod("Raj");
        System.out.println("value of num1 before swap "+12);
        System.out.println("value of num2 before swap "+13);
        swap(12,13);
        varargsMethod(a);
        varargsMethod(b);
    }
}
