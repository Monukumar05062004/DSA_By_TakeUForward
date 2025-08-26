package dsa;

public class StringIsImmutable {
    public static void main(String[] args) {
        String str=new String("Monu");// first object
        str.concat(" Kumar"); //second object
        //we cant able to change or update on string objectf
        System.out.println("result of string "+str);
        StringBuffer sb=new StringBuffer("Monu");
        sb.append("Kumar");
        System.out.println("result of stringBuffer "+sb);
    }
}
