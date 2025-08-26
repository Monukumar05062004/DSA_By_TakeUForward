package dsa_by_shradha;
import java.util.Stack;
public class StackReversalWithoutUsingAnotherStack {
    static void insertAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.add(data);
            return ;
        }
        int top=s.pop();
        insertAtBottom(s,data);
        s.add(top);
    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        insertAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
