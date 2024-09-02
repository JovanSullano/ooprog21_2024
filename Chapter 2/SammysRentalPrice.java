import java.util.Scanner;

public class SammysRentalPrice {

    public static void displayMotto() {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
    }

    public static void main(String[] args) {
        final int HOURLY_RATE = 40;
        final int MINUTES_IN_HOUR = 60;
        Scanner input = new Scanner(System.in);
        displayMotto();
        System.out.print("Enter the number of minutes the equipment was rented: ");
        int totalMinutes = input.nextInt();
        int hours = totalMinutes / MINUTES_IN_HOUR;
        int extraMinutes = totalMinutes % MINUTES_IN_HOUR;

             int totalCost = (hours * HOURLY_RATE) + extraMinutes;

        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes: " + extraMinutes);
        System.out.println("Total price: $" + totalCost);

        input.close();
    }
}
