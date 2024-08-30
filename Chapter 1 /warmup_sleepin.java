import java.util.Scanner;

public class warmup_sleepin {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it a weekday? (true/false): ");
        boolean isWeekday = scanner.nextBoolean();

        System.out.print("Are we on vacation? (true/false): ");
        boolean isVacation = scanner.nextBoolean();

        boolean result = sleepIn(isWeekday, isVacation);

        System.out.println("Sleep in: " + result);
    }
}
