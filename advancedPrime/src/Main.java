import java.util.Scanner;

public class Main {
    static boolean prime(int n) {
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    static boolean prime2(int n) {
        int i = n - 1;
        return n % i != 0;
        prime2((n - 1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        System.out.println(prime2(n));;
    }
}
