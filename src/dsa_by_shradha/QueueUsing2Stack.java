package dsa_by_shradha;
import java.util.Stack;
public class QueueUsing2Stack {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
       static  Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty(){
            return (s1.isEmpty());
        }
       static  public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.add(data);
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
       static  public int pop(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
       static public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
