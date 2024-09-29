package Assignments;

import java.util.Scanner;

public class psumall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String guess = sc.next();
        while(guess.equals("x")){
            int num = sc.nextInt();
            sum +=num;
             guess = sc.next();
           
            }
            System.out.println("the sum is "+ sum);
        }
    }

