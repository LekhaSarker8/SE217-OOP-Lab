public class StringSplitExample {
    public static void main(String[] args) {
      // 1. Splitting comma-separated values (CSV)
        String csv = "apple,banana,cherry,dates";
        String[] fruits = csv.split(",");
        
        System.out.println("Splitting the CSV string:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Splitting a sentence into words
        String sentence = "Java is a versatile programming language";
        String[] words = sentence.split(" ");
        
        System.out.println("Splitting the sentence into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 3. Splitting a string with multiple delimiters (comma and space)
        String mixed = "one, two, three, four";
        String[] items = mixed.split(",\\s+");
        
        System.out.println("Splitting the string with multiple delimiters:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
