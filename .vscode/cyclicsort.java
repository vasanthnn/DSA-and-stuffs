import java.util.Arrays;

public class cyclicsort {
    //when the nos range from 1 to n use cyclic sort
    public static void main(String[] args) {
        int [] arr= {5,2,4,3,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclesort(int[] arr){
        int i=0;
        while(i<arr.length) {
            int value =arr[i];
            int index = value-1;
            if(arr[i]!=arr[index]){
            int temp =arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        i++;
    }
    }
}
