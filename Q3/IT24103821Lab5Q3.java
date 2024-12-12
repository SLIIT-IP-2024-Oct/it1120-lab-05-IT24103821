import java.util.Scanner;

public class IT24103821Lab5Q3 {
   
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int DISCOUNT_3_TO_4_DAYS = 10;
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input start date and end date
        System.out.print("Enter the start date (day): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (day): ");
        int endDate = scanner.nextInt();

        // Validate the dates
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;

        // Calculate the discount rate
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate the total amount to be paid
        int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        int discountAmount = totalAmount * discountRate / 100;
        int amountToBePaid = totalAmount - discountAmount;

        // Display the results
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + amountToBePaid);

        scanner.close();
    }
}
