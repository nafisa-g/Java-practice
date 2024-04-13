import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Count characters");
            System.out.println("2. Count words");
            System.out.println("3. Find and replace");
            System.out.println("4. Convert to uppercase");
            System.out.println("5. Convert to lowercase");
            System.out.println("6. Reverse text");
            System.out.println("7. Check palindrome");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.println("Number of characters: " + text.length());
                    break;
                case 2:
                    String[] words = text.split("\\s+");
                    System.out.println("Number of words: " + words.length);
                    break;
                case 3:
                    // Implement find and replace functionality
                    break;
                case 4:
                    System.out.println("Uppercase: " + text.toUpperCase());
                    break;
                case 5:
                    System.out.println("Lowercase: " + text.toLowerCase());
                    break;
                case 6:
                    // Implement text reversal
                    break;
                case 7:
                    // Implement palindrome check
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
