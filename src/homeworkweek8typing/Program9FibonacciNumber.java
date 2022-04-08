package homeworkweek8typing;

import java.util.Scanner;
/**
 *
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 *
 */

public class Program9FibonacciNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(scanner.nextInt());
        scanner.close();
    }

    public static void isFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }






}
