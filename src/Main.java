import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sec = new Scanner(System.in);
        int a = sec.nextInt();
        int b = sec.nextInt();

        System.out.println(func(a, b));
    }

    /**
     * Calculates the greatest common divisor (GCD) of two positive integers using recursion.
     *
     * @param a The first positive integer.
     * @param b The second positive integer.
     * @return The GCD of 'a' and 'b'.
     */
    public static int func(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        } else {
            return func(b, a % b); // Recursive case: GCD(a, b) = GCD(b, a % b)
        }
    }
}