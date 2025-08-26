package learnCodeWithDurgaSoftwareSolution.learnAccessModifier.package2;

class Child extends LearnAboutProtected{
    public static void main(String[] args) {
        Child p=new Child();
        p.m1();
        LearnAboutProtected ob=new Child();
        ob.m1();

    }
}

public class LearnAboutProtected {

    protected void m1(){
        System.out.println("M1 Method is Running");
    }
}
