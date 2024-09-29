package Assignments.Leetcode;

public class seperate {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};

       System.out.println(seperateno(arr));
       

    }

    private static int[] seperateno(int[] arr) {

        int[] ans = new int[arr.length];
        int odd = 1;
        int even = 0;

        for (int i = 0; i < ans.length; i++) {
            if(arr[i] % 2==0 && even <ans.length ){ 
                ans[even] = arr[i];
                even+=2;
            }

            if(arr[i] % 2!=0 && odd < ans.length ){
                ans[odd] = arr[i];
                odd+=2;
            }
        }

        return ans;   
    }
}
