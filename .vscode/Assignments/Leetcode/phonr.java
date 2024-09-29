package Assignments.Leetcode;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.ArrayList;

public class phonr {
    
    public static void main(String[] args) {
       pad( "", "12");

    }

    static void pad(String p,String up){

        if(up.isEmpty()){

            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);

            pad(p +ch , up.substring(1));
        }

    }

    
    static ArrayList<String>padRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';

        ArrayList<String> list = new ArrayList<String>();
        if(digit == 7){ for (int i = (digit-2)*3; i <=(digit-1)*3; i++) {
            char ch = (char) ('a'+i);
        
           list.addAll(padRet(p+ch, up.substring(1)));
        }}
        if(digit ==8){
            for (int i = (digit-2)*3 +1; i <=(digit-1)*3; i++) {
                char ch = (char) ('a'+i);
    
               list.addAll(padRet(p +ch , up.substring(1)));
            }    
        }
        if(digit == 9){ for (int i = (digit-2)*3 +1; i <=(digit-1)*3; i++) {
            char ch = (char) ('a'+i);
        
           list.addAll(padRet(p+ch, up.substring(1)));
        }}
        if(digit>=1 && digit <=6 ){for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char) ('a'+i);

           list.addAll(padRet(p +ch , up.substring(1)));
        }}

        return list; 

    }



}
