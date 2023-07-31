import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many steps of Fibonacci's array do you want to see? ");
        int loop = input.nextInt();
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= loop; i++) {
            int sum = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
