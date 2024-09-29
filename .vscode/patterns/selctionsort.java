
import java.sql.Array;

public class selctionsort {
    public static void main(String[] args) {
        int arr[]={4,2,1,3,5};

       fselectionsort(arr);
       for (int i = 0; i < arr.length; i++) {
        
           System.out.print((arr[i]));
       }
 
    }

    static void fselectionsort(int[] arr){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for (int j = 0; j<n-i; j++) {
                int min=arr[j];
                if(min>arr[j+1]){
                     arr[j]=arr[j+1];
                     arr[j+1]=min;
                }
            }
        }
    }


}