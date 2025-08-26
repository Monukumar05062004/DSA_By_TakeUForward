package CollegeWhallah;

 class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
    }
}
public class LearnLinkedListByCW {

     static void printAllElementOfLl(Node node){
         while(node!=null){
             System.out.println(node.data);
             node=node.next;
         }
     }
    public static void main(String[] args) {
         Node node1=new Node(1);
         Node node2=new Node(2);
         Node node3=new Node(3);
         node1.next=node2;
         node2.next=node3;
         Node head=node1;
         printAllElementOfLl(head);
    }
}
