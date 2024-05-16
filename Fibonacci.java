/**
 * Author: Elijah Hutchison
 * Date: 5/16/2024
 *
 * Program that uses a recursive method to find the nth number in the fibonacci sequence
 */
public class Fibonacci {
    /**
     * Recursive method that finds the nth value in the fibonacci sequence
     * @param n the position of the Fibonacci number to be calculated
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Recursive case: calculate the nth Fibonacci number
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Main method sets the value of n and prints the nth term
     * @param args
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
