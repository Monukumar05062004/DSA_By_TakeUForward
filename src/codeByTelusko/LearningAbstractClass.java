package codeByTelusko;

abstract class Arithmetic{
    public abstract int sum(int number1, int number2);
    public void run(){
        System.out.println("Arithmetic class is running");
    }
}

public class LearningAbstractClass {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.sum(12,13);
    }
}
