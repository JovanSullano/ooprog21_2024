import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(int wordNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word " + wordNumber + ": ");
        return scanner.nextLine().trim();
    }

    public static int vowelIndex(String word) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void run() {
        String word1 = getWord(1);
        String word2 = getWord(2);

        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            String spoonerizedWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
            String spoonerizedWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }

    public static void main(String[] args) {
        run(); 
    }
}
