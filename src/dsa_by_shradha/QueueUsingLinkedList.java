package dsa_by_shradha;

public class QueueUsingLinkedList {
    static Node tail;
    static Node head;
   static class Node {
        int data;
        Node next;
        Node(int data){
          this.data=data;
          next=null;
        }
    }
    static class Queue{

        public boolean isEmpty(){
           return (tail==null);
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
        public void remove(){
            if(isEmpty()){
                System.out.println("Queue of LikedList is empty");
                return;
            }
            if(head.next==null){
               tail=null;
            }
            head=head.next;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue of LikedList is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
       Queue ob=new Queue();
       ob.add(12);
       ob.add(13);
       while(!ob.isEmpty()){
           System.out.println(ob.peek());
           ob.remove();
       }
    }
}
