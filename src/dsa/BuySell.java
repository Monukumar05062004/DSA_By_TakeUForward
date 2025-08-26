package dsa;

public class BuySell {
    public static void main(String[] args) {
        int arr[],profit=0;
        arr=new int[]{7,2,5,3,10,4};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                profit=Math.max(profit,arr[i]-arr[j]);
            }
        }
        System.out.println("Max profit to buy and sell is "+profit);
    }
}
