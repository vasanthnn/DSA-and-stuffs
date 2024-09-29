package Assignments.Leetcode;

import java.util.ArrayList;

public class fstlst {
    public static void main(String[] args) {

        int [] arr = {5,7,7,8,9,10};
        int target = 0;
        System.out.println(findingindex(arr, target));
    
        
    }
    public static ArrayList<Integer> findingindex(int[]nums,int target){
        
        ArrayList<Integer> list = new ArrayList<>();
        int s =0;
        int e = nums.length-1;


        while(s<=e){
        int mid = s + (e-s)/2;
        
            if(target == nums[mid]){
                list.add(mid);
                return list;
            }
            else{
                if(target <= nums[mid]){
                    e = mid-1;}
                 if(target >= nums[mid]){
                    s = mid+1;
                }
        }
    }
    list.add(-1,-1);
    return list;

    }
}
