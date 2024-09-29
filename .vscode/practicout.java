

public class practicout {

    public static void main(String[] args) {

        int nums[] = {4395,338,445,552,24};

       // int num = 234323;

        int ans = findingsumofevendigits(nums);
        System.out.println(ans);
        
    }
    static int findTarget(int num){
        int count =0;    
            while(num   >0){
            num /= 10;
            count++;}
       return count;     
}

 static int findingsumofevendigits(int nums[]){
    int count = 0;
    for (int i=0; i<nums.length;i++) {       
       if(evenornot(nums[i])){
        count ++;
       }
    }
    return count;
 }
 static boolean evenornot(int  num){
    int even = findTarget(num);
    if(even%2 ==0){
        return true;
    }
    return false;
 }

}
