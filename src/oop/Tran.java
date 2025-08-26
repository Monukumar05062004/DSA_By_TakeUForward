package oop;
import java.util.Scanner;
class Account {
    int bal;
    Account(int bal){
        this.bal=bal;
    }
   boolean inSufficient(int w){
        if(bal>w){
            return true;
        }
        else{
            return false;
        }

    }
    void withdraw(int amt ,String g){
        bal=bal-amt;
        System.out.println(g+"Transaction Successful");
        System.out.println(g+"current balance is"+bal);
    }
}
class Customer implements Runnable{
    String s1;
    Account a1;
    Customer(Account a1,String s1){
        this.s1=s1;
        this.a1=a1;
    }
    public void run(){
        Scanner ob=new Scanner(System.in);
        synchronized(a1) {
            System.out.println("Enter the amount to withdraw " + s1 + ":");
            int amt = ob.nextInt();
            if (a1.inSufficient(amt)) {
                a1.withdraw(amt, s1);
            } else System.out.println("insufficient balance");
        }
    }
}
public class Tran {
    public static void main(String[] args) {
    Account ob1=new Account(5000);
    Customer c1=new Customer(ob1,"Amit");
    Customer c2=new Customer(ob1,"Monu");
    Thread t1=new Thread(c1);
    Thread t2=new Thread(c2);
    t1.start();
    t2.start();
    }
}
