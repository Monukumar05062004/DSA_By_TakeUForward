package learnCodeWithDurgaSoftwareSolution;
class Parent{
    Parent(){
        System.out.println(this.hashCode());
    }
}
class Child extends Parent{
    Child(){
        System.out.println(this.hashCode());
    }
}

public class LoopHolesInInterfaceAndAbstractClass {
    public static void main(String[] args) {
        Child child=new Child();
        System.out.println(child.hashCode());
    }
}
