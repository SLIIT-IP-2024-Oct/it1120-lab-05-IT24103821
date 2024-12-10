import java.util.Scanner;

public class IT24103821Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of new members introduced
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the entered number
        if (newMembers < 0) {
            System.out.println("Invalid number. The number of new members should be greater than or equal to 0.");
        } else {
            // Determine the prize using a switch statement
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Print the prize
            System.out.println("The customer is entitled to: " + prize);
        }

        scanner.close();
    }
}