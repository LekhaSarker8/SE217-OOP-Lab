public class MethodExercise {
    // Exercise: Create a method that calculates the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Exercise: Create a method that calculates the circumference of a circle
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Exercise: Create a method that checks if a string is empty
    public static boolean isStringEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Exercise: Create a method that reverses a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    //calculate the factorial of a number using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Testing the calculateArea method
        double area = calculateArea(5.0, 3.0);
        System.out.println("Area of rectangle: " + area);

        // Testing the calculateCircumference method
        double circumference = calculateCircumference(4.0);
        System.out.println("Circumference of circle: " + circumference);

        // Testing the isStringEmpty method
        String testString = "Hello";
        boolean isEmpty = isStringEmpty(testString);
        System.out.println("Is the string empty? " + isEmpty);

        // Testing the reverseString method
        String originalString = "Java";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed string: " + reversedString);

        // Testing the factorial method
        int resultFactorial = factorial(5);
        System.out.println("Factorial of 5: " + resultFactorial);
    }
}