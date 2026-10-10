public class NestedLoopExample {
    public static void main(String[] args) {
        // Example 1: Nested For Loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("Outer loop iteration: " + i + ", Inner loop iteration: " + j);
            }
        }

        // Example 2: Nested While Loop
        int x = 1;
        while (x <= 3) {
            int y = 1;
            while (y <= 2) {
                System.out.println("Outer while loop iteration: " + x + ", Inner while loop iteration: " + y);
                y++;
            }
            x++;
        }

        // Example 3: Nested Do-While Loop
        int a = 1;
        do {
            int b = 1;
            do {
                System.out.println("Outer do-while loop iteration: " + a + ", Inner do-while loop iteration: " + b);
                b++;
            } while (b <= 2);
            a++;
        } while (a <= 3);
    }
}