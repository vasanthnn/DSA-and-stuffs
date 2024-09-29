package Assignments;

import java.util.ArrayList;

public class Rlinersrch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5};
        int target = 4;
        System.out.println(linearsearch(arr,0,target,new ArrayList<>()));
    }
    static ArrayList<Integer> linearsearch(int[]arr,int index,int target, ArrayList<Integer>list){

        if(index == arr.length){
            return list;
        }
        if(arr[index]== target){
             list.add(index);
        }
        return linearsearch(arr, index+1, target,list);

    }
}
