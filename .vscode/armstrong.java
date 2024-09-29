import java.util.Scanner;

public class armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
       if(Armstrong(n) == n){
        System.out.println(n +" it is Armstrong number");
       }
       else{
        System.out.println(n +" not an Armstrong number");
       }
    
    }

   public static int  Armstrong( int n){
     int  sum = 0;
        while (n>0) {

            int rem = n%10;
            sum += rem* rem* rem;
            n = n/10;
        }
        return sum;
    }       
    }

