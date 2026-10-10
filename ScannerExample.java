public class ScannerExample {
    public static void main(String[] args) {
        // Example 1: Using Scanner to read an integer
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);

        // Example 2: Using Scanner to read a string
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.println("You entered: " + text);

        // Example 3: Using Scanner to read a double
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Example 4: Using Scanner to read multiple inputs
        System.out.print("Enter two integers separated by space: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("You entered: " + num1 + " and " + num2);

        // Close the scanner
        scanner.close();
    }
}
