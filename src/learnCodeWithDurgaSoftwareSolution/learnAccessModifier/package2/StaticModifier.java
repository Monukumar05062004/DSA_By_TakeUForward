package learnCodeWithDurgaSoftwareSolution.learnAccessModifier.package2;

public class StaticModifier {
    static int x1=10;
    int x2=10;
    public static void main(String[] args) {
        //System.out.println(x2);// non static variable x2 can not be referenced from static block
        StaticModifier ob=new StaticModifier();
        ob.getInfo1();
    }
    public void m1(){
        System.out.println(x1);// x1 is static variable we can call from instance method
        System.out.println(x2);// instance variable directly call from instance method
    }

    int rollNo=12;
    String name;
    static String cName="Arya";
    int getInfo(){
        return rollNo;
    }
     String getInfo1(){
        System.out.println(cName);
        return cName;
    }
}
