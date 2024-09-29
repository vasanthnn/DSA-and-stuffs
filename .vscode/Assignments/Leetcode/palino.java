package Assignments.Leetcode;

// https://leetcode.com/problems/palindrome-number/description/

public class palino {
    
    public static void main(String[] args) {
        int n = 121;
        
    // System.out.println(isPalindrome(n));
       System.out.println(palinumber(n));
    }
    
    public static boolean isPalindrome(int x) {


        String ans = Integer.toString(x);

        String revans = revans("", ans);
        if(ans.equals(revans)){
            return true;
        }
        
        return false;
    }

    private static String revans(String s ,String up){
        if(up.isEmpty()){
            return s;
        }

        char ch = up.charAt(0);

         return revans(ch + s, up.substring(1));
    }


    private static boolean palinumber(int x){

        int palindrom = x;

        int reverse = 0;
        while(palindrom>0){
            int rem = palindrom%10;

            reverse = (reverse*10)+ rem;

            palindrom/=10;
        }

        return reverse == x;

    }

}
