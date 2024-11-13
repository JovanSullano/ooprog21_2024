import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
