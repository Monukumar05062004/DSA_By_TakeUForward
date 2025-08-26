package dsa_by_shradha;

public class Towerof_hanoi {
    static void tower(int n,String src,String help,String dest){
        if(n==1) {
            System.out.println("Disk " + n + " transfer from "  + src + " to " + dest);
            return;
        }
        tower(n-1,src,dest,help);
        System.out.println("Disk "+n+" transfer from "+src+" to"+" "+dest);
        tower(n-1,help,src,dest);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("For Disk "+n);
        tower(n,"s","h","d");
    }
}
