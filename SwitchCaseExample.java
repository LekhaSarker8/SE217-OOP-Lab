public class SwitchCaseExample {
   public static void main(String[] args) {
   // Example 1: Switch with Integer (Country Selection)
    int x = 3;   
    switch(x) {
        case 1:
             System.out.println("Bangladesh");
             break;
        case 2:
             System.out.println("Austria");
             break;
        case 3:
             System.out.println("Germany");
             break;
        default:
             System.out.println("Out of the earth");
    } 

    
        // Example 2: Switch with String (Menu Selection)
        String role = "viewer"; 
        System.out.println("User role: " + role);

        switch (role) {
            case "admin":
                System.out.println("Access level: Full administrative privileges.");
                break;
            case "editor":
                System.out.println("Access level: Can edit and publish content.");
                break;
            case "viewer":
                System.out.println("Access level: Read-only access.");
                break;
            default:
                System.out.println("Access level: Unknown role.");
                break;
        }
   } 
}
