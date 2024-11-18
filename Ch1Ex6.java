public class Ch1Ex6 {
    public static void main(String[] args) {
        //Division by Zero not possible. Runtime error
        System.out.print("Celsius 35 is Fahrenheit: ");
        //In Integer 9/5==1 so 1*35==35 so we have to use Double Data type;
        //Solution: 9.0,5.0
        System.out.println((9 / 5) * 35 + 32);
    }
}