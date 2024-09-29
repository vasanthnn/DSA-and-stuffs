package Assignments;

import java.util.ArrayList;
import java.util.Arrays;


public class threelarge {
    public static void main(String[] args) {
        int [] arr =  {0,0,1,1,1,2,2,3,3,4};

        // find3large(arr);
        // find2ndlargest(arr);
        // movezerotolast(arr);
        System.out.println(removeDuplicates(arr));

        
    }


     static  void find3large(int[]arr){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> first){
                third = second;
                second = first;
                first = arr[i];
            }

            else if(arr[i]> second && arr[i]!= first){
                third = second;
                second = arr[i];
            }

            else if(arr[i]> third && arr[i]!= first && arr[i]!= second){
                third = arr[i];
            }
        }

        System.out.println(first + " " +second + " " + third );
    }

    static void find2ndlargest(int[]arr){

        Arrays.sort(arr);

        int ans =0;

        for (int i = 0; i < arr.length; i++) {
             ans = arr[arr.length-2];
        }

        System.out.println(ans);
    }

    static void movezerotolast(int[]arr){
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
    }

}

       while (count<arr.length){
           arr[count] = 0;
            count++;

}
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void removedup(int[]arr){


        for (int i = 0; i < arr.length; i++) {
            int j;
            for ( j = 0; j < i; j++) {
                if(arr[i]== arr[j]){
                    break;
                }
            }
            if(i == j){
              System.out.println(arr[i]+ " ");
            }
        }
    }

    public  static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            int j ;
            for(j = 0;j<i ; j++){
                if(nums[i] == nums[j]){
                    break;
                }
            }
            if(i == j ){
                k++;
            }
        }

        return k;
    }
}
