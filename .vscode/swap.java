import java.util.Scanner;

public class swap {
    
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("enter a");
    //    int a =sc.nextInt();
    //    System.out.println("enter b");
    //     int b = sc.nextInt();

    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("a: " +a);
    //     System.out.println("b: " + b);
        swaping(10,15);
    
    
    }

    static void swaping(int a,int b){

       a = a+b;
       b = a-b;
       a = a-b;

       System.out.println(a);
       System.out.println(b);
    }
}
