public class pivot {
    public static void main(String[] args) {
        int[] arr ={3,4,5,6,7,8,0,1,2};
        int start =0;
        int end =arr.length-1;
        System.out.println(searchinpeak(arr,start,end));
    }
     static int searchinpeak(int[]nums,int start,int end){

        while(start<end){
            int mid = (start +end)/2;
            if(nums[mid] < nums[mid+1]){
                end  = mid-1;
                }
            else {
                start  = mid+1;
            
            }
            return mid;
        }
        return -1;


    }
}


