package dsa_by_shradha;
import java.util.Scanner;
class LL1{
    Node head;
    private int size;
    LL1(){
        size=0;
    }
   public class Node {

      public  String data;

       Node next;
       Node(String data){
          this.data=data;
          next=null;
       }
    }
    public void addFirst(String data){
       Node newNode=new Node(data);
       newNode.next=null;
       head=newNode;
       size++;
    }
    public void lastAdd(String data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            newNode.next=null;
            head=newNode;
            return ;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void deletion(){
        Node currNode=head;
        if(head==null){
            return;
        }
        int size1=size;
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter nth element that you want to delete");
        int num=ob.nextInt();
        if(num==1){
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
            size--;
            return ;

        }
         if(num<size) {
             size1=size1-1-num;
            while (size1>0) {
                size1--;
                currNode=currNode.next;
            }
             size--;
            currNode.next=currNode.next.next;
        }else if(num==size){
             head=head.next;
             size--;
         }
    }
    public void display(){
        Node currNode1=head;
        while(currNode1!=null){
            System.out.print(currNode1.data+"->");
            currNode1=currNode1.next;
        }
        System.out.println("Null");
    }
}
public class RemoveNodeFromLast {
    public static void main(String[] args) {
        LL1 l1=new LL1();
        l1.addFirst("Name");
        l1.lastAdd("Monu");
        l1.lastAdd("Kumar");
        l1.lastAdd("roll");
        l1.lastAdd("35");
        System.out.println("Lis before deletion");
        l1.display();
        l1.deletion();
        l1.display();
    }

}
