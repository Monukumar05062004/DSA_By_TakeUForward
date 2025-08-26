package dsa_by_shradha;

public class LL {
    Node head;
    private int size;
    LL(){
       this.size=0;
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
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            newNode.next=head;
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
        Node currNode1=head;
        while(currNode1!=null){
            System.out.print(currNode1.data+"->");
            currNode1=currNode1.next;
        }
        System.out.println("Null");
    }
    public void firstDelete(){
        if(head==null){
            return;
        }
        head=head.next;
        size--;
    }
    public void lastDelete(){
        if(head==null){
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node current2 =head;

        while(current2.next.next!=null){
            current2=current2.next;
        }
        current2.next=null;
    }

    public static void main(String[] args) {

        LL list=new LL();
        list.addFirst("Monu");
        list.addFirst("kumar");
        list.addFirst("Monu");
        list.display();
//        System.out.println("List that is visible below after addition of extra element in list");
//        list.addFirst("this");
//        list.addLast("of our");
//        list.addLast("program");
//        list.display();
//        list.firstDelete();
//        System.out.println("List after First element deletion");
//        list.display();
//        list.lastDelete();
//        System.out.println("List after last element deletion");
//        list.display();
//        list.firstDelete();
//        System.out.println("List after First element deletion");
       // list.display();
//        list.firstDelete();
//        System.out.println("List after First element deletion");
//        list.display();
        System.out.println(list.size);
    }
}
