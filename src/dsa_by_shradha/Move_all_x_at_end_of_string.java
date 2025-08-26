package dsa_by_shradha;
import java.util.Collections;
public class Move_all_x_at_end_of_string {
    static StringBuilder swap_x_in_string(StringBuilder str,int indx,int size,char x){
        if(indx==str.length()-1||size==0||indx>size)
            return str;
        if((str.charAt(indx)=='x')&&(str.charAt(size)=='x')){
            swap_x_in_string(str,indx,size-1,'x');
            return str;
        }else if((str.charAt(indx)=='x')){
          char temp=str.charAt(indx);
          char temp1=str.charAt(size);
          str.setCharAt(indx,temp1);
          str.setCharAt(size,temp);
          swap_x_in_string(str,indx+1,size-1,'x');
           // Collections.swap(,indx,size);
        }else{
            swap_x_in_string(str,indx+1,size,'x');
            return str;
        }
        return str;
    }
    public static void main(String[] args) {
        StringBuilder strbul=new StringBuilder("axbcxxx");
        System.out.println("after moving all x at end in a string "+strbul);
        StringBuilder result=swap_x_in_string(strbul,0,strbul.length()-1,'x');
        System.out.println("after moving all x at end in a string "+result);
    }
}
