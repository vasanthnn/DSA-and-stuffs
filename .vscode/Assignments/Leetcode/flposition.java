package Assignments.Leetcode;

public class flposition {
 
        public static void main(String[] args) {
            
            
        int [] arr = {5,7,7,8,8,9,10};
        int target = 8;
        System.out.println(searchRange(arr,target));
        }
    
        public static int[] searchRange(int[] nums, int target) {
    
            int[] ans = {-1, -1};
            // check for first occurrence if target first
            ans[0] = search(nums, target, true);
            if (ans[0] != -1) {
                ans[1] = search(nums, target, false);
            }
            for (int i = 0; i < ans.length; i++) {
                
                System.out.println(ans[i]);
            }
            return ans;
        }
    
        // this function just returns the index value of target
        private static int search(int[] nums, int target, boolean findStartIndex) {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while(start <= end) {
                // find the middle element
    //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;
    
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    // potential ans found
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }

