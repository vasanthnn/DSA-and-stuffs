package Assignments;

import java.util.Scanner;

public class multab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to make table ");
        int n = sc.nextInt();
        for (int i = 1; i<=15; i++) {
            int mult = n * i;
            System.out.println(i + " x " + n + " = " + mult);
        }
    }
}
