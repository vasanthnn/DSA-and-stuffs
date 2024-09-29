package Strings;

public class reversestr {
    public static void main(String[] args) {
        String word = "abcd";
     reverseString("", word);
      rString(word);
      
       }

       static void reverseString(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);   
                reverseString(ch + p, up.substring(1));
              
        }

        static void rString(String up){
            if(up.isEmpty()){
                return ;
            }
            char ch = up.charAt(0);   
            System.out.println(ch);
            rString(up.substring(1));
                  
            }
}
