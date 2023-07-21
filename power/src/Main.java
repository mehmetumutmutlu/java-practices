import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the base number: ");
        int n = input.nextInt();
        System.out.print("Please enter the power: ");
        int p = input.nextInt();

        int total = 1;

        for (int i = 1; i <= p; ++i) {
            total *= n;
        }

        System.out.println(total);
    }
}
