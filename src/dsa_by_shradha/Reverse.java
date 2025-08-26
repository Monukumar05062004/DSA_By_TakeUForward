package dsa_by_shradha;
import java.util.Stack;
public class Reverse {
   static  Stack<Integer> s2=new Stack<>();
    static Stack<Integer> reverse(Stack<Integer> s1){

        if(s1.isEmpty()){
            return s1;
        }
        int data=s1.pop();
        s2.add(data);
        reverse(s1);
        return s2;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        reverse(s);
        while(!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }
    }
}
