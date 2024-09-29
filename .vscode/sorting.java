import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[]={4,5,9,2,1,0};

        insertionsort(arr);
 
        System.out.println(Arrays.toString(arr));


    }
    static void fselectionsort(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for (int j = 0; j< arr.length-i-1; j++) {
                int min=arr[j];
                if(min>arr[j+1]){
                     arr[j]=arr[j+1];
                     arr[j+1]=min;
                }
            }
        }
    }
    static void bubblesort(int[]nums){
        int i;
        int n = nums.length-1;
        for(i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1] =temp;
            
            }   
        }
    }
    }

    static void insertionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] =temp;
                }
                
            }
        }
    }
    
}
