package dsa_by_shradha;

public class CircularQueue {
    static class Queue{
       static int front=-1,rear=-1;

        int arr[];
        int size;
        Queue(int size){
            this .size=size;
            arr=new int[size];
        }
        public boolean isEmpty(){
            return (rear==-1&&front==-1);
        }
        public boolean isFull(){
            return ((rear+1)%size==front);
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=((rear+1)%size);
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
               return -1;
            }
            int result;
            result=arr[front];
            if(((front+1)%size)==rear){
                rear=front=-1;
                return -1;
            }
            front++;
            return result;
        }
        public int  peek(){
           if(isEmpty()){
               System.out.println("queue is empty");
               return -1;
           }
           return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(12);
        q.add(14);
        q.add(19);
        q.add(1);
        q.add(10);


        System.out.println( q.remove());
        q.add(18);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
