package Strings;

import Assignments.Leetcode.arr;

public class Letterfrequency {
    

    public static void main(String[] args) {
        
        System.out.println(countingfreq("aabbbccddzz"));

    }


    public static String countingfreq(String s){

        int[] array = new int[26];

        for (int i = 0; i <s.length(); i++) {
            array[s.charAt(i) -'a'] += 1; 
        }

        String ans = "";

        for (int i = 0; i < 26;i++) {
            
            if(array[i] != 0){
                char ch = (char) (i+ 'a');

                ans += ch + String.valueOf(array[i]);
               
            }
            
        }

        return ans;
    }
}
