import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type the distance in the format of kilometers: ");
        double km = input.nextDouble();

        double kmp = 2.20;
        int starting = 10;

        double totalCost = (starting + km * kmp) < 20.0 ? 20 : (10.0 + km * kmp);
        System.out.println("The total cost: " + totalCost);
    }
}
