package dsa;

public class DsaProblem {

    public static void main(String[] args) {
    int num1=100,num2=200,result=0;
    while(num1<=num2){
        int digit=num1;
        boolean flag=true;
        while(digit>0){
            int val=digit%10;
            if(val==0||num1%val!=0){
                flag=false;
                break;
            }
            digit/=10;
        }
        if(flag){
           result=num1+result;
        }
        num1++;
    }
        System.out.println(result);
    }
}
