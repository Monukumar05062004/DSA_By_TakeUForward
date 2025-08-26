package dsa_by_shradha;

public class fibonacci {
    static void fibo(int start,int end,int n ){
        int temp;
        if(n==0)
            return;
        temp=end;
        end=start+end;
        start=temp;
        n--;
        System.out.println(end);
        fibo(start,end,n);
    }
    public static void main(String[] args) {
        int s=0,e=1,n=10;
        System.out.println(0+"\n"+1);
        fibo(s,e,n);
    }
}
