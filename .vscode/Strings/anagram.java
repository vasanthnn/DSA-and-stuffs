package Strings;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        System.out.println(checksanagram(a,b));

        
    }

    public static boolean checkanagram(String a,String b){
        char [] str1 = a.toCharArray();
        char [] str2  = b.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    // optimal solution 
    public static boolean checksanagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[]  count1= new int[250];
        int [] count2 = new int[250];

        for (int i = 0; i < a.length(); i++) {
            count1[a.charAt(i)]++;
            count2[b.charAt(i)]++;

        }


        for (int i = 0; i < 250; i++) {
            if(count1[i]!= count2[i]){
                return false;
            }
        }

        return true;
    }
}
