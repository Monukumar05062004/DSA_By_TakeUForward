package dsa_by_shradha;
import java.util.Stack;
public class PushInStackAtBottom {
     static final int data1=4;
    static void recursion(Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data1);
            return ;
        }
        int data= s.pop();
        recursion(s);
        s.push(data);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        recursion(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
