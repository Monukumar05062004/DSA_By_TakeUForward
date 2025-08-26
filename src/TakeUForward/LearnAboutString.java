package TakeUForward;

public class LearnAboutString {
    public static void main(String[] args) {
        //Reverse a string using String builder
        String s="Monu";
       String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
        boolean result=palindromeCheck(s);
        System.out.println(result);
        System.out.println("I Love Java "+reverseWord("I Love Java"));
        System.out.println(removeVowels("Monu Kumar"));
        System.out.println(rotateString("Monu",2));
    }
    // check given string is palindrome
    static boolean palindromeCheck(String s){
       return new StringBuilder(s).reverse().toString().equals(s);
//       if(s1.equals(s)){
//           return true;
//       }else{
//           return false;
//       }
    }
   static String   reverseWord(String s){
       String[] stringsArr= s.split(" ");
       String result="";
       for(String s1:stringsArr){
           result+=new StringBuilder(s1).reverse().toString()+" ";
       }
       return (result.trim());
    }
    static String removeVowels(String s){
        String[] arr=s.split(" ");
        String result="";
        for(String subString:arr){
            for(int i=0;i<=subString.length()-1;i++){
                if(subString.charAt(i)!='A'&&subString.charAt(i)!='E'&&subString.charAt(i)!='I'&&subString.charAt(i)!='O'&&subString.charAt(i)!='U'&&subString.charAt(i)!='A'&&subString.charAt(i)!='a'&&subString.charAt(i)!='e'&&subString.charAt(i)!='u'&&subString.charAt(i)!='o'){
                    result+=subString.charAt(i);
                }
            }
            result+=" ";

        }
        return (result.trim());
    }
   static String  rotateString(String name,int r){
        int size=name.length();
        int rotation=r%size;
        String newRS=name.substring(size-rotation);
            if((size-rotation)!=0)
            {
                newRS+=name.substring(0,size-rotation);
            }
            StringBuilder sb=new StringBuilder();
            String stringFirst="Monu";
            String stringSecond="unoM";
            boolean result=new StringBuilder(stringSecond).reverse().toString().equals(stringFirst);
       System.out.println(result);
        return  newRS;
    }
}
