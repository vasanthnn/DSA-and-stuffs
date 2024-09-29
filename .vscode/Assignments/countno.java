package Assignments;

public class countno {
    public static void main(String[] args) {
        int n = 5040220;

        // countingno(n);
        // System.out.println(count);
        System.out.println(countzero(n));
    }

    static int count = 0;
    static void countingno(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        countingno(n/10);
    }

    static int countzero(int n){
        return helper( n, 0);
    }

    private static int helper(int n, int c){

        if(n == 0){
            return c;
        }

        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }

        return helper((n/10), c);

    }
}
