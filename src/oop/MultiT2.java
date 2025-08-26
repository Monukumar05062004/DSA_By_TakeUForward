package oop;
class Pro1 extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Pro1 "+i);
        }
    }
}
class Pro2 extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Pro2 "+i);
        }
    }

}
public class MultiT2 {
    public static void main(String[] args) {
      Pro1 p1=new Pro1();
      Pro2 p2=new Pro2();
      p1.start();
      p2.start();
    }
}
