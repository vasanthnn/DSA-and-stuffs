import java.util.Scanner;

public class num {
    
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the range of an numbers");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.print("enter nos:");
        for (int i=0;i<size;i++)
        {
          numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        
        for(int i=1;i<numbers.length;i++)
        {
            if(numbers[i]>max)
            {
                max =numbers[i];
            }
        }
            System.out.println("the max number is " + max);
       
        }
    }

