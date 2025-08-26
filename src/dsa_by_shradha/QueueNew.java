package dsa_by_shradha;

public class QueueNew {
   static class Queue{
        int arr[];
        int size;
        int r=-1;
        Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public boolean isEmpty(){
            return r==-1;
        }
        public void add(int data){
            if(r==size-1){
                System.out.println("queue is full");
                return ;
            }
            r++;
            arr[r]=data;
        }
        public void remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return;
            }
            int front=arr[0];
           for(int i=0;i<r;i++){
               arr[i]=arr[i+1];
           }
           r--;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
