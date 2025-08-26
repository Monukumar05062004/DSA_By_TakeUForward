package oop;

import java.lang.StringBuilder;
public class String_Builder {
    public static void main(String[] args) {
        // string in java are immutable
        //declaration
       // StringBuilder ob;
        //assignment
        //ob = new StringBuilder("M");
       // ob.append("onu");
      //  System.out.println(ob.length());
        StringBuilder ob=new StringBuilder("Monu");
        for(int i=0;i<(ob.length()/2);i++){
            int fornt=i;
            int back=ob.length()-1-i;
            char f_val=ob.charAt(fornt);
            char b_val=ob.charAt(ob.length()-1-i);
            ob.setCharAt(fornt,b_val);
            ob.setCharAt(back,f_val);
        }
        System.out.println(ob);
    }
}
