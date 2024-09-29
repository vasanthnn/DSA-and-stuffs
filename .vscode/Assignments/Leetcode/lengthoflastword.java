package Assignments.Leetcode;

public class lengthoflastword {
    public static void main(String[] args) {
       System.out.println(lengthOfLastWord("fly me   to   the moon"));
    }

    public static  int findloflastword(String s){

        if(s.length() ==0){
            return -1;
        }
        String []arr = s.split(" ");

        String  ans = arr[arr.length-1];

        int n = ans.length();

        return n;


    }

    public static int lengthOfLastWord(String s) {
        int res = 0; int o = 0;
        for (int i =s.length()-1; i>=0; i--){
            if (s.charAt(i)==' ' && o == 1) return res;
            if (Character.isLetter(s.charAt(i))) {res++; o=1;}
        }
        return res ;
    }
}
