

public class pattern1 {
    public static void main(String[] args) {
        Printpattern(5);
    }

    static void  Printpattern(int n){

        
        for (int i=0; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
