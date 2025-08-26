package dsa_by_shradha;

public class LinkedListPro2 {
    Node head;
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

    public static void main(String[] args) {

    }
}
