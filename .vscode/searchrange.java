public class searchrange {
    public static void main(String[] args) {
        int []nums ={5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(findrange(nums, target));
     
        
    }
    static int[] findrange(int[]nums, int target){
    int[] ans = {-1,-1};

    int start =search(nums,target,true);
    int end = search(nums,target,false);

    ans[0] =start;
    if (ans[0] != -1) {
        ans[1] = search(nums, target, false);
    }
   
    return ans;
    }
        

    static int  search(int[]nums,int target , boolean findfirstindex){
    int ans = -1;
    int start = 0;
    int end = nums.length-1;

    while(start<=end){
        int mid = start +(end-start)/2;
        if(target < nums[mid]){
            end = mid-1;}
         if(target > nums[mid]){
            start = mid+1;
        }
        else{    
            ans = mid;
                if(findfirstindex){
                    end = mid -1;}
                    else{
                        start = mid+1;
                    }
                }
        }
        return ans;
    }
}


