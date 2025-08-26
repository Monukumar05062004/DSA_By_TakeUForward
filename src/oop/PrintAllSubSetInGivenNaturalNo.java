package oop;
import java.util.ArrayList;
public class PrintAllSubSetInGivenNaturalNo {
    static void printSubset(int n, ArrayList li){
        if(n==0){
            for(int i=0;i<li.size();i++){
                System.out.print(li.get(i));
            }
            System.out.println();
            return ;
        }
        li.add(n);
        printSubset(n-1,li);
        li.remove(li.size()-1);
        printSubset(n-1,li);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList li=new ArrayList();
        printSubset(n,li);
    }
}
