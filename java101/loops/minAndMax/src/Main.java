import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int loop = input.nextInt();
        int min = 0, max = 0;
        for (int i = 1; i <= loop; i++) {
            System.out.print(i + ". number: ");
            int n = input.nextInt();
            if ((min == 0) || (n < min)) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }
        System.out.print("Min: " + min);
        System.out.println();
        System.out.print("Max: " + max);
    }
}
