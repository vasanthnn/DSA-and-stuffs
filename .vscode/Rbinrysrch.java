public class Rbinrysrch {
    public static void main(String[] args) {
        int [] arr= {2,3,4,5,7,9};
        int target = 9;
        int s=0;
        int e=arr.length-1;
        System.out.println(binarysearch(arr,target,s,e));
    }
    static int binarysearch(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target <arr[mid]){
          return  binarysearch(arr, target, s, mid-1);}
        if(target>arr[mid]){
            return binarysearch(arr, target, mid+1, e);
        }
        else{
            return arr[mid];
        }
           
        }
    }
