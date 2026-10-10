public class IfElseExample {
    public static void main(String[] args) {

        // Example 1
        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Example 2
        int number = 7;

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        //Example 3
        char ch = 'I';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }

        //Example 4
        int x = 85;
        if (x % 2 == 0 && x % 5 ==0) {
            System.out.println("Good Morning.");
        } else if (x % 2 == 0 || x % 5 ==0) {
            System.out.println("Good Afternoon.");
        } else {
            System.out.println("Good Evening.");
        }
    }
}