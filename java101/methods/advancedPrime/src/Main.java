import java.util.Scanner;

public class Main {
    static void isPrime(int n) {
        if (n < 1) {
            System.out.println("Error: Invalid number.");
            return;
        }
        if (primeCheck(n, n - 1) == 0) {
            System.out.println(n + " is NOT a prime number.");
        } else {
            System.out.println(n + " is a prime number.");
        }
    }
    static int primeCheck(int n, int check) {
        if (check == 1) {
            return 1;
        } else if (n % check == 0) {
            return 0;
        } else {
            return primeCheck(n, check-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        isPrime(n);
    }
}
