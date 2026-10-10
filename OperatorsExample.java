public class OperatorsExample {
    public static void main(String[] args) {
        // Example 1: Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // Example 2: Relational Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // true
        System.out.println("Is a less than or equal to b? " + (a <= b)); // false

        // Example 3: Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Example 4: Assignment & Compound Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("After += 5, c = " + c); // 25
        c -= 3; // c = c - 3
        System.out.println("After -= 3, c = " + c); // 22
        c *= 2; // c = c * 2
        System.out.println("After *= 2, c = " + c); // 44
        c /= 2; // c = c / 2
        System.out.println("After /= 2, c = " + c); // 22

        // Example 5: Unary Operators(postfix and prefix)
        int d = 5;
        System.out.println("Postfix Increment: " + (d++)); // 5
        System.out.println("After Postfix Increment, d = " + d); // 6
        System.out.println("Prefix Increment: " + (++d)); // 7
        System.out.println("After Prefix Increment, d = " + d); // 7

        // Example 6: Precedence and Associativity
        int result = 10 + 5 * 2; // Multiplication has higher precedence
        System.out.println("Result: " + result); // 20

    }
}
