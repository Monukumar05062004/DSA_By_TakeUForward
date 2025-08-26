package dsa;

import java.util.ArrayList;

public class Dec_to_Binary {
    public static void main(String[] args) {
        int q,n=12;
//       ArrayList<Integer> list=new ArrayList<>();
//        q=n;
//        while(q!=0){
//            list.add(q%2);
//            q=q/2;
//        }
//        for(int j=list.size()-1;j>=0;j--) {
//            System.out.println(list.get(j));
//        }
        //print nth term
        int nth=18;
        int t1=0,t2=1,tn;
        tn=t1+t2;
        nth-=3;
        while(nth!=0){
            t1=t2;
            t2=tn;
            tn=t1+t2;
            nth--;
        }
        System.out.println(tn);
    }
}


