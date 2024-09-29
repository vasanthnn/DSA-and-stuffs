public class SumOfDigits {
    public static int sumOfDigits(int number) {
        // Initialize sum
        int sum = 0;
        // Iterate through each digit in the number
        while (number > 0) {
            // Extract the last digit
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }
        // Return the sum of digits
        return sum;
    }

    public static void main(String[] args) {
        int number = 123;

        System.out.println("Sum of digits: " + sumOfDigits(number));
        
    
        System.out.println(num);}
}
