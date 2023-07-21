import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a higher number than 0: ");
        int number = input.nextInt();

        int i = 0, total = 0, n = 0;

        while (i < number) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                ++n;
            }
            ++i;
        }

        System.out.println(total / n);
    }
}
