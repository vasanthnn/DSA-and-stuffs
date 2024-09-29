package Assignments.Leetcode;

public class searchinsertpost {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5};
        System.out.println(searchInsert(arr, 3));
    }

    public  static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;

        if(target == 0){
            return target;
        }

        if(nums.length == 1){
            if(nums[0]< target){
                return 1;
            }
            else{
                return 0;
            }
        }

        while(s<=e){
        int mid =s + (e-s)/2;
         if(target == nums[mid]){
            return mid;
         } 
         else if(target < nums[mid])  {
            e = mid -1;
         }
         else if(target > nums[mid]){
            s = mid + 1;
         }
        }
    return s+1;
}


    
}
