import java.util.*;

public class Ch2Ex2 {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute the area
        double area = radius * radius * 3.14159;

        // Display the result
        System.out.println("The area for the circle with radius: " + radius + " is: " + area);
    }
}