package Assignments.Leetcode;


import java.util.Arrays;

public class revstring {
    

    public static void main(String[] args) {
        char[] s= {'h','e','l','l','o'};
        reversfr(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reversfr(char[]s){
        for (int i = 0; i <=s.length/2; i++) {
             char temp = s[i];
             s[i]= s[s.length-i-1];
             s[s.length-i-1]= temp;
            }
    }

    public static void reverswhl(char[]s){
        int left = 0;
        int right = s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right]= temp;
            left ++;
            right --;

        }
    }

    
}
