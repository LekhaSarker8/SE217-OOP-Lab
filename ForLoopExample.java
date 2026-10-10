public class ForLoopExample {
    public static void main(String[] args) {
        // Example 1: Basic For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Example 2: For Loop with Array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Example 3: Enhanced For Loop (For-Each)
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        // Example 4: calculating the sum of numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Example 5: counting down from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);

        // Example 6: counting even numbers from 1 to 20
        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println("Even number: " + j);
            }
        }
    }
 }
}