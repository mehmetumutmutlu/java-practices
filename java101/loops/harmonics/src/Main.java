import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }

        System.out.println(sum);
    }
}
