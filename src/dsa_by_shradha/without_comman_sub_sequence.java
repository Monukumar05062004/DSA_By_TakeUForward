package dsa_by_shradha;
import java.util.HashSet;
public class without_comman_sub_sequence {
    static void make_sub_sequence_byRemove_comman(String str , int indx,String newstr, HashSet set){
        if(indx==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
            System.out.println(newstr);
            set.add(newstr);
            return;
            }
        }
        char current=str.charAt(indx);
        //include
        make_sub_sequence_byRemove_comman(str,indx+1,newstr+current,set);
       // not include
        make_sub_sequence_byRemove_comman(str,indx+1,newstr,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet set=new HashSet();
        make_sub_sequence_byRemove_comman(str,0,"",set);
    }
}
