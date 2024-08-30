public class PatternPrinter {
    public static void main(String[] args) {
        String[] pattern = {
            "X                      X",
            "X                      X",
            "X                      X",
            "XXXXX XXXXXXXXXXX XXXXXX",
            "X   X X         X X    X",
            "X   X X         X X    X",
        };
        
        for (String line : pattern) {
            System.out.println(line);
        }
    }
}
