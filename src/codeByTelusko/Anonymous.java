package codeByTelusko;

class Calculator1{
    int sum(int number1, int number2){
        System.out.println("sum operation is performing in Calculator1");
       return number1+number2;
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Calculator1 calculator=new Calculator1(){
           public int sum(int number1,int number2){
                System.out.println("sum operation is performing in Anonymous");
                return number1+number2;
            }

        };
        System.out.println(calculator.sum(19,1));
    }
}
