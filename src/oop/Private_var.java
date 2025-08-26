package oop;
class Pri{
    private String dep;//private instance variable
    String d;//default instance var
    void print(){
        dep="dep";
        System.out.println(dep);
    }
}
public class Private_var {
    public static void main(String[] args) {
        Pri m=new Pri();
        m.print();
        m.d="daly";
    }
}
