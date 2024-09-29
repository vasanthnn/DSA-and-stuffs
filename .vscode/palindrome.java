public class palindrome {
    public static void main(String[] args) {

         System.out.println(palindromeword("Was it a car or a cat I saw?"));

   


            
        }
      
    
   

    static boolean ispalindrome(String name){
        int i=0;
        for (i=0; i<=name.length()/2;i++) {
            if(name.charAt(i) == name.charAt(name.length()-1-i)){
                continue;
            }
            else{
                return false;
            }

    }
    return true;
}

        static boolean palindromeword(String s){         
            
        String ans = s.replaceAll("[^a-zA-Z0-9]", "");
        ans = ans.toLowerCase();

        for (int i = 0; i < ans.length()/2;i++) {
            if(ans.charAt(i) == ans.charAt(ans.length()-1-i)){
                continue;
            }
            else{

                return false;
            }
        }
        return true;
}
}