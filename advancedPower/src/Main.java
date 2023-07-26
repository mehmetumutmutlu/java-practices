import java.util.Scanner;

public class Main {
    static void power(int base, int exp) {
        int result = 1;
        if (exp != 0) {
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
        }
        System.out.println("The result: " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base value: ");
        int base = input.nextInt();
        System.out.print("Please enter the exponent value: ");
        int exp = input.nextInt();

        power(base, exp);
    }
}
