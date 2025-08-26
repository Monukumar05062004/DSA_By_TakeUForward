package dsa_by_shradha;

public class Queue {
   static public class QueueUsingArray{
       static int array[];
       static int size;
       static int r=-1,f=-1;

       QueueUsingArray(int size){
           array=new int[size];
           this.size=size;
       }
       public boolean isEmpty(){
          return ((r==-1)&&(f==-1));
       }
       public boolean isFull(){
           return ((r+1)%size)==f;
       }
       public void add(int data){
           if(isFull()){
               System.out.println("Queue is full");
               return;
           }
           if(f==-1){
               f=0;
           }
           array[++r]=data;
       }

       public int pop(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
           int result=array[f];
           if(f==r){
               f=r=-1;
               return -1;
           }
           f=(f+1)%size;
           return result;
       }
       // Time complexity of peek an element is 0(n).
       public int peek(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
         return array[f];
       }

   }
    public static void main(String[] args) {
        QueueUsingArray ob=new QueueUsingArray(3);
        ob.add(12);
        ob.add(13);
        ob.add(1);
        while(!ob.isEmpty()){
            System.out.println( ob.peek());
            ob.pop();
        }
    }
}
