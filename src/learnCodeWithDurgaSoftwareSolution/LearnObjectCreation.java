package learnCodeWithDurgaSoftwareSolution;

class Monu{
    Monu(){

    }
}
class Student{
    void test(){

    }
}
public class LearnObjectCreation {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Student o=new Student();
        System.out.println(args[0]);
        Object o1=Class.forName(args[0]).newInstance();
        System.out.println("object created for LearnObjectCreation");
    }
}
