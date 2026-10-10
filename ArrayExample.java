public class ArrayExample {
    public static void main(String[] args) {
         // 1. Calculating sum and average of array elements
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.println("\nSum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        // 2. Finding the maximum and minimum elements in an array
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // 3. Reversing an array
        int[] reversedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedArray[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        // 4. Searching for an element in an array
        int searchElement = 30;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        // 5. Counting occurrences of an element in an array
        int countElement = 20;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == countElement) {
                count++;
            }
        }
        System.out.println("Occurrences of " + countElement + ": " + count);
    }
}