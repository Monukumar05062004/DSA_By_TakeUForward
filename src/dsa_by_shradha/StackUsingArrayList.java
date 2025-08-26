package dsa_by_shradha;
import java.util.ArrayList;
public class StackUsingArrayList {
   static  class Stack{
        ArrayList<Integer> a=new ArrayList<>();
        public boolean isEmpty(){
            return a.size()==0;
        }
        public void push(int data){
            a.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int data=a.get(a.size()-1);
            a.remove(a.size()-1);
            return data;
        }
        public int peep(){
            if(isEmpty()){
                return -1;
            }
            return a.get(a.size()-1);
        }
    }
    public static void main(String[] args) {
            Stack s=new Stack();
            s.push(1);
            s.push(3);
            s.push(4);
            while(!s.isEmpty()){
                System.out.println(s.peep());
                s.pop();
            }
    }
}
