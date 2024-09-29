import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {

        printArray();
        
    }
    
    static void printArray(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of an array");
        String[] array = new  String[sc.nextInt()]; 

        for (int i = 0;i<array.length; i++) {
            array[i] = sc.next();
        }
    
            System.out.println(Arrays.toString(array));  
            System.out.println(array.length); 

            sc.close();
        
    }
}
