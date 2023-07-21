import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        System.out.println("3'S POWER:");
        for (int i = 1; i <= n; i *= 3) {
            System.out.println(i);
        }
        System.out.println("---------");
        System.out.println("4'S POWER:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
    }
}
