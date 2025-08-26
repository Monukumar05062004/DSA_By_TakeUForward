package oop;

public class Wrapper {
    public static void main(String[] args) {
        String str="1234";
        String str1="123";
        int x=Integer.parseInt(str);
        System.out.println("value of x is "+x);
        Integer i=Integer.valueOf(str1);
        int val =i.intValue();
        System.out.println("value of a val is "+val);
        //class Double contain method name is parseDouble()
       double dy= Double.parseDouble(str);
       dy+=1.0;
        System.out.println("value of a double after increment by 1 is "+dy);
        //class Double contain method name is valueOf()
        Double od=Double.valueOf(str1);
        double dz=od.doubleValue();
        System.out.println("Value of a double dz is "+dz);

    }
}
