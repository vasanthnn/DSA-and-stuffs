package Assignments;

public class Rbinary {
    public static void main(String[] args) {
        int [] arr = {7,8,9,0,1,2};
        System.out.println(binarysearch(arr,9,0,arr.length-1));
    }

    static int binarysearch(int[]arr,int target,int s,int e){
        int m = s + (e-s)/2;

        if(s>e){
            return -1;
        }

        if(arr[m]== target){
            return m;
        }

        if(arr[s]<= arr[m]){
            if(arr[s]<=target && target<= arr[m]){
                return binarysearch(arr, target, s, m-1);
            }
            else{
                return binarysearch(arr, target, m +1, e);
            }
        }
        else{
            if(arr[m]<=target && target <= arr[e]){
                return binarysearch(arr, target, m+1, e);
            }
            else{
                return binarysearch(arr, target, s, m-1);
            }
        }
    }
}
