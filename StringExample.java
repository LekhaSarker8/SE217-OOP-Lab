public class StringExample {
    public static void main(String[] args) {
        // Example 1: Creating and Initializing a String
        String str1 = "Hello, World!";
        System.out.println("String 1: " + str1);

        // Example 2: Accessing Characters in a String
        char ch = str1.charAt(0);
        System.out.println("Character at index 0: " + ch);

        // Example 3: Finding the Length of a String
        int length = str1.length();
        System.out.println("Length of the string: " + length);

        // Example 4: Concatenating Strings
        String str2 = "Welcome to Java!";
        String combined = str1 + " " + str2;
        System.out.println("Combined string: " + combined);

        // Example 5: Comparing Strings
        String str3 = "Hello, World!";
        boolean isEqual = str1.equals(str3);
        System.out.println("Are the strings equal? " + isEqual);

        // Example 6: Converting to Uppercase and Lowercase
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
    }
}