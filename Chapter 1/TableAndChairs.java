public class PatternPrinter {
    public static void main(String[] args) {
        // Define the pattern
        String[] pattern = {
            "X                      X",
            "X                      X",
            "X                      X",
            "XXXXX XXXXXXXXXXX XXXXXX",
            "X   X             X    X",
            "X   X             X    X"
        };
        
        // Print the pattern
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}
