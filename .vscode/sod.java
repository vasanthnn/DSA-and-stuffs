import java.util.Scanner;

public class sod {

   static int sumofdigit(int n){

    int sum = 0;

    while (n>0) {

        int rem = n%10;
        sum+=rem;
        n = n/10;
    }
    return sum;    

}     
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        sc.close();

        System.out.println(sumofdigit(n));
        


    }

}
