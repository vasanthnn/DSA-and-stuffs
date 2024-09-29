package Strings;

import java.util.Arrays;

public class prac {

    public static void main(String[] args) {

    //   int []  nums = {0,1,0,3,12};

    // //   moveZeroes(nums);

    // int a = 10;
    // int b = ++a + a++ + --a; 
    // System.out.println(b);

      
    //   System.out.println(Arrays.toString(nums));


    String str = "121";
int rem =0;
    for (int i = 0; i < str.length(); i++) {
        
       int  no = rem*10 + str.charAt(i)-'0';

       System.out.println(no);
    }

    
    }


    public static  void moveZeroes(int[] nums) {
        int count = 0;
        for(int  i=0;i<nums.length;i++){
            if(nums[i]!= 0){
                nums[count] = nums[i];
                count++;
            }
        }

        while(count<nums.length){
            nums[count] = 0;
            count++;
        }



}
   
    }

