package learnCodeWithDurgaSoftwareSolution;

public class LearnSwitchStatement {
    public static void main(String[] args) {
//        int a=120;
//        final int y=10;
//        switch(a){
//
//            case y:
//                System.out.println("y value is"+y);
//            case 120:
//                System.out.println(" a is containing "+a);
//                break;
//
//        }
        byte b=127;
        switch(b+1){
            case 127:
                System.out.println("Valid switch expression");
                break;
            case 128:
                System.out.println(" switch expression");
            default :
                System.out.println("default block");
        }
    }
}
