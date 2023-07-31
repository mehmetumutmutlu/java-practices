import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double rawCost, ageDiscount = 0, typeDiscount = 0, finalCost, amount = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the distance in the format of kilometers: ");
        int distance = input.nextInt();
        System.out.print("Please enter the passenger age: ");
        int age = input.nextInt();
        System.out.print("Please choose the flight type (1: One-way, 2: Round-trip): ");
        int type = input.nextInt();

        rawCost = distance * 0.10;

        if ((distance > 0) && (age > 0) && (type == 1 || type == 2)) {
            if (age < 12) {
                ageDiscount = rawCost * 0.50;
            } else if (age < 24) {
                ageDiscount = rawCost * 0.10;
            } else if (age > 65) {
                ageDiscount = rawCost * 0.30;
            }

            if (type == 2) {
                typeDiscount = (rawCost - ageDiscount) * 0.20;
                amount = 2;
            }

            finalCost = ((rawCost - ageDiscount) - typeDiscount) * amount;

            System.out.print("Your ticket costs " + finalCost + " TL.");
        } else {
            System.out.print("Error: Invalid input");
        }

    }
}
