package dsa_by_shradha;

public class StackNew {
    static Node head;
    static class Node{

        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   static class LL{

        public boolean isEmpty(){
            return head==null;
        }
        public void add(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return ;
            }
            newNode.next=head;
            head=newNode;
        }
        public void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            head=head.next;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        LL ob=new LL();
        ob.add(12);
        ob.add(13);
        while(!(head==null)){
            System.out.println(ob.peek());
            ob.pop();
        }
    }
}
