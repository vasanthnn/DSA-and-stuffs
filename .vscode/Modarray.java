import java.util.Arrays;

public class Modarray {

    int[] arr = new int[5];
    int size;

    
    public Modarray() {
        int[] arr = new int[5];
    }



    public void insertfirst(int n){
        this.arr[0] = n;
        size++;
    }

    public void insert(int index,int n){

        if(isfull(size,arr.length)){
            int[] temparr = new int[arr.length*2];
            arr = temparr;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                int temp = arr[index];
                arr[index]= n;
                arr[index+1] = temp;

            }

        }
    }



    private boolean isfull(int size2, int length) {

        return arr.length == size;
    }



    @Override
    public String toString() {
        return "Modarray [arr=" + Arrays.toString(arr) + "]";
    }

    
}
