package dsa_by_shradha;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node1 top=null;
    public void add(int data){
        Node1 newNode=new Node1(data);
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public int remove(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int result=top.data;
        top=top.next;
        return result;
    }
    public int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int result=top.data;

        return result;
    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(1);
        l1.add(2);
        while(!(l1.top==null)){
            System.out.println(l1.peek());
            l1.remove();
        }
    }
}
