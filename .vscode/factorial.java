import java.util.Scanner;
public class factorial {

public static void printFactorial(int n){

    int factorial =1;
 

    for(int i=n; i>=1;i--){

        factorial = factorial * i;
        
    }
        System.out.println("the factorial of the number is " + factorial);

}

    public static void main (String args[]){
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        
        // printFactorial(n);       

        // sc.close();

        System.out.println(fact(5));
    }


    public static  int fact(int n){

        int ans = 1;    

        while(n>1){

            ans = ans*n;
            n = n-1;
        }

        return ans;
    }
}
