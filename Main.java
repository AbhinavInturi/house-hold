import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int familyMembers;
        double waterConsumed;
        int houseNumber;
        char usageStatus;

        System.out.print("Enter family members: ");
        familyMembers = sc.nextInt();

        System.out.print("Enter water consumed: ");
        waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNumber = sc.nextInt();

        System.out.print("Enter water usage status: ");
        usageStatus = sc.next().charAt(0);

        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed);
        System.out.println("House Number: " + houseNumber);
        System.out.println("Usage Status: " + usageStatus);

        sc.close();
    }
}