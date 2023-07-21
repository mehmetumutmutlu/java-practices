import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the total amount: ");
        int n = input.nextInt();
        System.out.print("Please enter the cluster's element counts: ");
        int r = input.nextInt();

        int n_factorial = 1, r_factorial = 1, n_minus_r_factorial = 1;

        for (int i = 1; i <= n; ++i) {
            n_factorial *= i;
        }

        for (int i = 1; i <= r; ++i) {
            r_factorial *= i;
        }

        for (int i = 1; i <= (n - r); ++i) {
            n_minus_r_factorial *= i;
        }

        double combination = (double) n_factorial / (r_factorial * n_minus_r_factorial);

        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
