import java.util.Arrays;
import java.util.Scanner;

import Assignments.Leetcode.sudoku;

public class array {
    
    public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);

    //     int size = sc.nextInt();
    //     String names[] = new String[size];

    //     for(int i=0;i<size;i++){
    //         names[i] = sc.next();

    //      }

    //      for ( int i=0;i<names.length;i++)
    //      {
    //         System.out.print(names[i]);
    //      }
    // sc.close();


    Modarray arr = new Modarray();

   arr.insertfirst(5);
   arr.insertfirst(5);
   arr.insertfirst(5);
   arr.insert(3, 6);
   arr.insert(6, 7);

   System.out.println(arr.toString());

}
}