import java.util.Scanner;

public class funct {
    
    public static void tosum(int a,int b){

        int sum = a + b;
        System.out.println("the sum of a and b is " + sum);
        return;
    }
    public static void main(String args[]){
Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
     
            
            tosum(a,b);
    }
}
