package Assignments.Leetcode;

import java.util.Arrays;

public class movebysigns {
    
    public static void main(String[] args) {


        int[] arr = {-2,-5,1,-4,5,6,7,-9};

        int[] arr2 = new int[arr.length];

        int i = 0; int j = 1;
        int k = 0;

        while (k<arr.length) {
            if(arr[k]>0){
                arr2[i] = arr[k];
                i+=2;
                k++;
            }
            else{
                arr2[j] = arr[k];
                j+=2;
                k++;
            }
        }
        
        System.out.println(Arrays.toString(arr2));

    }
}
