package dsa_by_shradha;

public class ReverseLinked {
    Node head;
    private int size;
    ReverseLinked(){
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
    public void reverse(){
        Node previous=head ;
        Node current=head.next ;
        while(current!=null){
            Node Next= current.next;
            current.next=previous;
            //update
            previous=current;
            current=Next;

        }
        head.next=null;
        head=previous;
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
        ReverseLinked ll=new ReverseLinked();
        ll. addFirst("1");
        ll.addLast("5");
        ll.addLast("7");
        ll.addLast("3");
        ll.display();
        ll.display("7");
        ll.reverse();
        ll.display();
    }
}
