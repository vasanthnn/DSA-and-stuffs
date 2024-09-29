package Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",3);
        // System.out.println(diceRet("", 7));
        // System.out.println(dicecount("", 3));
        
    }
    static void  dice(String p,int target){
        
        if(target == 0){
             System.out.println(p);
            return ;
        }


        for (int i = 1;i<=6 && i <=target; i++) {
            dice(p + i, target-1);
        }
        


    }
    static ArrayList<String> diceRet(String p,int target){
     
        if(target == 0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
            
        }
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i<=target ; i++) {
            list.addAll(diceRet(p + i, target - i));     
        }
        return list;

    }
    static int  dicecount(String p,int target){
        int count = 0;
        if(target == 0){
            return 1;
        }

        for (int i = 1; i<=target ; i++) {
            count += dicecount(p+i,target -i);

        }
        return count;
    }

}
