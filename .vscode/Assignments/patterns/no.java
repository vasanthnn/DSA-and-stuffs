package Assignments.patterns;

/**
 * no
 */
public class no {

    public static void main(String[] args) {
         printno(5);
        printno2(5);
    }

    static void printno(int n){
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j <= n; j++) {
                
                System.out.print(j + " ");
            }
            for (int k = 1; k <= i; k++) {
                
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    static void printno2(int n){
            for (int i = 1; i <=n; i++) {
                // space
                for (int j = 1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                // nums
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
    }
}