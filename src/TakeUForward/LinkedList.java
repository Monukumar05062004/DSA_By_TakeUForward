package TakeUForward;

class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
    Node node=new Node(35);
        System.out.println(node.data);
    }
}
