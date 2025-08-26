package dsa_by_shradha;

public class QueueY {
   static  class Node {
        int data;
        Node next;
        Node(int data){
           this.data =data;
           next=null;
        }
    }
    static class Queue{
        Node head;
        Node tail;
        public boolean isEmpty(){
            return ((head==null)&&(tail==null));
        }
        public void add(int data){
            Node newNode=new Node(data);
            if(tail==null){
                head=newNode;
                tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front= head.data;
            if(head==tail){
                head=tail=null;
                return front;
            }
            head=head.next;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front =head.data;
            return front;
        }
    }
    public static void main(String[] args) {
       //creation of a queue using linked list
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        System.out.println("Element in a queue");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
