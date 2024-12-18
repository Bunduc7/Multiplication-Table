import java.util.Scanner; // Import Scanner for user input

public class MultiplicationTable { // Main class definition
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter the size of the multiplication table
        System.out.print("Enter size of multiplication table: ");
        int size = scanner.nextInt(); // Read the input size

        // Create a 2D array to hold the multiplication table
        int[][] table = new int[size][size]; // Initialize the table based on input size

        // Populate the 2D array with multiplication values
        for (int i = 0; i < size; i++) { // Loop through rows
            for (int j = 0; j < size; j++) { // Loop through columns
                table[i][j] = (i + 1) * (j + 1); // Compute multiplication value
            }
        }

        // Display the multiplication table in matrix form
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) { // Loop through rows
            for (int j = 0; j < size; j++) { // Loop through columns
                System.out.printf("%4d", table[i][j]); // Print each value with alignment
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
