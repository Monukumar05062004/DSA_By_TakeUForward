package dsa_by_shradha;

public class Occurrenceof_anelement_instring {
    static int first=-1,last=-1;
    static void occurrence(String letter,int index,char element){
        if(index==letter.length()){
            System.out.println("first and last index of an element "+element+" is"+first+" "+last);
            return;
        }
            if(element==letter.charAt(index))
            {
                if(first==-1) {first=index;}
                last=index;
            }
            occurrence(letter,index+1,element);
    }
    public static void main(String[] args) {
        String letter="abaacdaefaah";
        occurrence(letter,0,'h');
    }
}
