package Assignments.patterns;

public class pattern {
    public static void main(String[] args) {
        printPyramid(5);
        printPyramid2(5);
    }

    static void printPyramid(int n){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int s = 1; s <=n-i; s++) {
                System.out.print(" ");
            }
            // first half
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            // second half
            for (int k =1; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    static void printPyramid2(int n){
        for (int i = 1; i <=n; i++) {
            // spaces
            for (int s = 1; s <=n-i; s++) {
                System.out.print(" ");
            }
            // first half
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            // second half
            for (int k =1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
