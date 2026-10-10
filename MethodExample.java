public class MethodExample {
    // Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Testing the sum method
        int resultSum = sum(5, 10);
        System.out.println("Sum of 5 and 10: " + resultSum);

        // Testing the factorial method
        int resultFactorial = factorial(5);
        System.out.println("Factorial of 5: " + resultFactorial);

        // Testing the isPrime method
        int testNumber = 29;
        boolean resultIsPrime = isPrime(testNumber);
        System.out.println(testNumber + " is prime: " + resultIsPrime);
    }
    
       //method that checks a condition and returns a boolean value
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //method that takes an array of integers and returns the maximum value
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

    
