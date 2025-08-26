package dsa_by_shradha;

public class Stack {

   static  class Node{
        String data;
        Node next;
        Node(String data){
           this.data=data;
           this.next=null;
        }
    }
   static  class StackData{
       static Node head;
        public boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        public void push(String data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
              this.head=newNode;
              return ;
            }
            newNode.next=head;
            head=newNode;
        }
//        public void diplay(){
//            if (isEmpty(head)) {
//                System.out.println("our stack empty");
//            }
//            Node curr=head;
//            while(curr!=null){
//                System.out.println(curr.data);
//                curr=curr.next;
//            }
//        }
        public String pop(){
            if(head==null){
                return "-1";
            }
            String num=head.data;
            head=head.next;
            return num;
        }
        public String peep(){
            if(head==null){
                return "-1";
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackData ob=new StackData();
        ob.push("Monu");
        ob.push("kumar");
       // ob.diplay();
       while(!ob.isEmpty()){
           System.out.println(ob.peep());
           ob.pop();
       }
    }
}
