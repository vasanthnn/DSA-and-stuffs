public class bubblesort {
    public static void main(String[] args) {
        int nums[]={4,3,5,1,8,2,9};
        int i=0;
        int n=nums.length-1;

        for(i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1] =temp;
            
            }   
        }
    }
    for(int k=0;k<nums.length;k++){
    System.out.print(nums[k] +" ");}
    System.out.println();
    } 
    
}

