import java.util.Arrays;

public class missinngnumber {
        public static void main(String[] args) {
        int [] arr={ 1,2,2,5,4};
        
    
       System.out.println(missingnumber(arr));
   //     System.out.print(missingnumber(arr,arr.length));
    }

    static int missingnumber(int[] arr){
        int i=0;
        int index=0;
        while(i<arr.length) {
            int value =arr[i];
             index = value-1;
            if(arr[i]!=arr[index]){
            int temp =arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        if(arr[i]!=index){
            return index;
        }
               
        else{
        i++;}
    }
        // search for finding a missing number
       return -1;
    }
}
