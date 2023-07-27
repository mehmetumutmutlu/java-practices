import java.util.Scanner;

public class Main {
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the base value: ");
        int base = input.nextInt();
        System.out.print("Please input the exponential value: ");
        int exp = input.nextInt();

        System.out.println(power(base, exp));
    }

}
