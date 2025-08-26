package dsa_by_shradha;

public class revision {
  static int count=0;
    static public boolean result(int a[],int x){
        boolean re=false;
        int size=a.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++) {
                if (x == a[i] + a[j]) {
                    count++;
                    re=true;
                }
            }
        }

        return re;
    }
    static  public int size(){
        return count;
    }
    public static void main(String[] args) {
        int []a={0,-1,-2,-3,1};
        int x=-2;
       if(result(a,x)){
           System.out.println("yes");
       }
       else {
           System.out.println("No");
       }
        System.out.println("No of Pair "+size());;
    }
}
//Time complexity 0(n)
//