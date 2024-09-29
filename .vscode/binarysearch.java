public class binarysearch {
    public static void main(String[] args) {
        // binary search is applicable only if array sort in ascending or descendig order
        int arr[] ={1,2,3,4,5,6,7,8,9,};

        int target = 8;

         System.out.println(findingtheno(arr, target));
        
    }

    static int findingtheno(int[] nums,int target){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
            else{
            if(target < nums[mid]){
                end = mid-1;}
             if(target > nums[mid]){
                start = mid+1;
            }
        }
        
    }
    return -1;
}
}

/