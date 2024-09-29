package Strings;

import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        String word = "abc";
        // System.out.println(possiblesREt("",word));
        possibles("", word);
    }

    static void possibles(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
         possibles(p+ch, up.substring(1));
           possibles(p, up.substring(1));
    }

    static ArrayList<String> possiblesREt(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list  = new ArrayList<>();
           list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = possiblesREt(p+ch, up.substring(1));
        ArrayList<String> right = possiblesREt(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
