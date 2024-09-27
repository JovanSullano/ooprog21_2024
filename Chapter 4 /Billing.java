public class Billing {

    public static void computeBill(double price) {
        printBill(price * 1.08); 
    }

    public static void computeBill(double price, int quantity) {
        printBill(price * quantity * 1.08); 
    }

    public static void computeBill(double price, int quantity, int discount) {
        double discountedPrice = price - (price * discount / 100); 
        printBill(discountedPrice * quantity * 1.08); 
    }

    private static void printBill(double total) {
        System.out.printf("The total price for the bill is: $%.3f%n", total);
    }

    public static void main(String[] args) {
        computeBill(23.2); 
        computeBill(24.2, 2); 
        computeBill(37.2, 2, 5); 
    }
}
