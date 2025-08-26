package interviewProblem;

abstract class AbstractClass{
    abstract int abstractMethod();
    public int show(){
        System.out.println("Hello Monu , it is a normal method in abstract class");
        return 1;
    }
}
public class Abstract extends AbstractClass{
    int abstractMethod(){
        System.out.println("Hello Monu , It is a abstract method in abstract class");
        return 1;
    }
    public static void main(String[] args) {
        Abstract ob=new Abstract();
        ob.abstractMethod();
        ob.show();
    }
}
