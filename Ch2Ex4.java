import java.util.*;

public class Ch2Ex4 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt and read a byte value
        System.out.print("Enter a byte value: ");
        byte a = input.nextByte();

        // Prompt and read a short value
        System.out.print("Enter a short value: ");
        short b = input.nextShort();

        // Prompt and read an int value
        System.out.print("Enter an int value: ");
        int c = input.nextInt();

        // Prompt and read a long value
        System.out.print("Enter a long value: ");
        long d = input.nextLong();

        // Prompt and read a float value
        System.out.print("Enter a float value: ");
        float e = input.nextFloat();

        // Display the entered values
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}