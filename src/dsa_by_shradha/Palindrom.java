package dsa_by_shradha;

import java.util.*;
class Section{
    Palindrom.Node middOfList(Palindrom.Node head){
        Palindrom.Node t=head;
        Palindrom.Node h=head;
        if(t==null){
            return t;
        }
        while(h.next!=null &&h.next.next!=null){
            h=h.next.next;
            t=t.next;
        }
        return t;
    }
    Palindrom.Node reverse(Palindrom.Node head){
        if(head.next==null){
            return head;
        }
        Palindrom.Node pre=null;
        Palindrom.Node curr=head;
        while(curr!=null){
            Palindrom.Node next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next.next;
        }
        return pre;
    }
    boolean isPalindrome(Palindrom.Node head ){
        Palindrom.Node midd=middOfList(head);
        if(midd==null|| midd.next==null) {
            return true;
        }
        Palindrom.Node firstFromLast=reverse(midd.next) ;
        Palindrom.Node first=head;

        while(firstFromLast!=null){
            if(firstFromLast.data!=first.data){
                return false;
            }
            firstFromLast=firstFromLast.next;
            first=first.next;
        }
        return true;
    }
}

public class Palindrom{
  static Node head;
    private int size;
    Palindrom(){
        this.size=0;
    }
   static public class Node{
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

    public static void main(String[] args) {
        Palindrom list=new Palindrom();
        list.addFirst("Monu");
        //list.addFirst("kumar");
        //list.addFirst("Monu");
        list.display();
        Section ob=new Section();
        System.out.println(ob.isPalindrome(head));
     }
}