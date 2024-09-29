package Assignments;

import java.util.Arrays;

public class Rbubblesort {
    public static void main(String[] args) {
        int [] arr = { 4,3,5,2,1};
       
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesort(int[]arr,int i,int j){
        if(i == 0 ){
            return;
        }
        if(j<i){
        if(arr[j]> arr[j+1]){
            int temp = arr[j];
            arr[j]= arr[j+1];
            arr[j+1]= temp;
        }
        bubblesort(arr,i,j+1);
    }
        else{
            bubblesort(arr, i-1,0);
        }
    }
    }

