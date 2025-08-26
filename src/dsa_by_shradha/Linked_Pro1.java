package dsa_by_shradha;

public class Linked_Pro1 {
    Node head;
    private int size;
    Linked_Pro1(){
        size=0;
    }
    public class Node{
     String data;
     Node next;
     Node(String data){
         this.data=data;
         this.next=null;
     }
    }
    public void addFirst(String data){
    Node newNode=new Node(data);
    newNode.next =head;
    head=newNode;
    }
    public void addLast(String data){
    Node newNode   =new Node(data);
    if(head==null){
        newNode.next =head;
        head=newNode;
        return;
    }
    Node currNode=head;
    while(currNode.next!=null){
      currNode=currNode.next;
    }
    currNode.next=newNode;
    }
    public void display(){
    Node currentNode=head;
    while(currentNode!=null){
        System.out.print(currentNode.data+"->");
        currentNode=currentNode.next;
    }
        System.out.print("null");
    }

    public void display(String num){
        Node currentNode=head;
        while(currentNode!=null&&currentNode.data!=num){
            currentNode=currentNode.next;
            size++;
        }
        if(currentNode==null){
            System.out.println("Element not found in linked  list");
            return ;
        }
        else
            System.out.println("index of the element is"+size);

    }
    public static void main(String[] args) {
        Linked_Pro1 ll=new Linked_Pro1();
       ll. addFirst("1");
       ll.addLast("5");
       ll.addLast("7");
       ll.addLast("3");
       ll.display();
       ll.display("7");
    }
}
