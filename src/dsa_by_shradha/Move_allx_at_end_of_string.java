package dsa_by_shradha;
public class Move_allx_at_end_of_string {
    static void move(String str,int indx,int count, String newstring){
        if(indx==str.length()){
            while(count!=0){
                newstring+='x';
                count--;
            }
            System.out.println(newstring);
            return;
        }
       if(str.charAt(indx)!='x'){
         newstring+= str.charAt(indx);
       }else {
           count+=1;
       }
       move(str, indx + 1,count,newstring);
   }
    public static void main(String[] args) {
        String str="12axbcx";int indx=0, count=0;
        move(str,indx,count," ");
    }
}
