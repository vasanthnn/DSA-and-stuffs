import java.util.Arrays;

public class binarysrch2D {
    public static void main(String[] args) {
        int [][] arr = {{3,2,1},
                        {4,5,6},
                        {7,8,9}};

        

                        System.out.println(Arrays.toString(search(arr,1)));

    }


    public static int[] search(int[][] nums,int target){

        int row =0;
        int col= nums.length-1;


        while (row <= nums.length-1 && col>=0) {
            if(target<nums[row][col]){
                col--;
            }
            else if(target>nums[row][col]){
                row++;

            }
            else{ 
                return  new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
}
