public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i <= 5);
    }

    // 2. Proving that do-while executes at least once even if condition is initially false
    public static void main2(String[] args) {
        int i = 10;
        do {
            System.out.println("This will be printed at least once.");
            i++;
        } while (i <= 5);
    }
}