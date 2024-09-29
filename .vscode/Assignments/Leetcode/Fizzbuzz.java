package Assignments.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public static void main(String[] args) {
        
        System.out.println(fizzBuzz(3));
    }

    public  static List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<String>();

        for(int k =1; k<=n ; k++){
            if(k %3==0 && k%5==0){
                list.add("FizzBuzz");
            }
            else if(k%3==0){
                list.add("Fizz");
            }
            else if(k%3==0){
                list.add("Buzz");
            }
            else{
                list.add(k+"");
            }
        }
       

        return list;
    }
}
