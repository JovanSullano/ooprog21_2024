public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the triangle

        // Generate the triangle pattern
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the 'T' characters
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("T");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
