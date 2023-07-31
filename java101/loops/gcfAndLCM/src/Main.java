import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int n2 = input.nextInt();

        int gcf = 0, lcm = 0;
        int i = n1;

        while (i >= 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcf = i;
                System.out.println("The Greatest Common Factor (GCF) of " + n1 + " and " + n2 + ": " + gcf);
                break;
            }
            i--;
        }

        lcm = (n1 * n2) / gcf;
        System.out.println("The Least Common Multiple (LCM) of " + n1 + " and " + n2 + ": " + lcm);
    }
}
