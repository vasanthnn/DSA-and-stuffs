package Assignments;

import java.util.*;

public class revno {
    public static void main(String[] args) {
        int n = 200;

        int digits = (int)(Math.log10(n)) + 1;

        System.out.println(digits);

        rev1(n);
        System.out.println(sum);
    }

    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;

        sum = sum *10 + rem;

        rev1(n/10);
        
    }
}
