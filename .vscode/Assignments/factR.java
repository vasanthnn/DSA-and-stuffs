package Assignments;

public class factR {
    public static void main(String[] args) {
        int n  = 123;

        int rem = n%10;
        // System.out.println(rem);
         System.out.println(sumofdigits(n));
        // System.out.println(PrintFact(n));
        // System.out.println(sum(n));
      
    
    }

    // static int  PrintFact(int n){
    //     if(n==1){
    //        return 1;
    //     }
        
    //     return n * PrintFact(n-1);
    // }

    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return n + sum(n-1);
    // }

    static int sumofdigits(int n){
        if(n == 0){
            return 1;
        }

        return (n%10)+ sumofdigits(n/10);
    }
 
}