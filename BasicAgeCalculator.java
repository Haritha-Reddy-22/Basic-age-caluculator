import java.util.Scanner;

public class BasicAgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their year of birth
        System.out.print("Enter your year of birth: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = java.time.Year.now().getValue();

        // Calculate the age
        int age = currentYear - birthYear;

        // Check if the input year is valid
        if (birthYear > currentYear) {
            System.out.println("The year of birth cannot be in the future.");
        } else {
            System.out.println("Your age is: " + age + " years.");
        }

        scanner.close();
    }
}
