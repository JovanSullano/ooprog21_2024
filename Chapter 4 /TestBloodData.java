import java.util.Scanner;

    public class TestBloodData {
      public static void main(String[] args) {
    
         BloodData patient = new BloodData();
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();
        patient.setBloodType(bloodType);

        System.out.print("Enter Rh Factor: ");
        String rhFactor = scanner.nextLine();
        patient.setRhFactor(rhFactor);

        patient.displayBloodInfo();
        
        scanner.close();
    }
}
