public class emoutain {
    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,0,1,2};
        int target = 5;

        System.out.println(findelemnt(arr, target));
        
    }
    static int findelemnt(int[] nums,int target){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
            else{
                return start;
            }
           
        }
        return -1;
    }

}
