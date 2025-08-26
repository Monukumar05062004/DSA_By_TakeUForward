package Com.DsaByStriver.java;
import java.util.Scanner;
public class powerOfn {
    static int powerFun(int p,int b){
        if(p==0){
           return 0;
        }
        if(p<2){
           return b;
        }
        return b*powerFun(p-1,b);
    }
    public static void main(String[] args) {
        int p,b;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter power and base");
        p=ob.nextInt();
        b=ob.nextInt();
        System.out.print(powerFun(p,b));
    }
}
