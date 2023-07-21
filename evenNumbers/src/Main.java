import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int total = 0, n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter a number: ");
            n = input.nextInt();

            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println(total);
    }
}
