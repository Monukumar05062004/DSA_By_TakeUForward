package dsa_by_shradha;
class power{
    int power_val;
   int  power1(int p,int b){
       if(p==1)
           return b;
      if(b==0)
          return 0;

      int xpowern_1= power1(p/2,b);
      if((p&1)==0){
          power_val=xpowern_1*b;

      }else
          power_val = xpowern_1 * b*b;
      return power_val;

    }
        }
public class Power_of_xn {

    public static void main(String[] args) {
           power ob=new power();
          int p_val= ob.power1(3,2);
        System.out.println(p_val);
    }
}
