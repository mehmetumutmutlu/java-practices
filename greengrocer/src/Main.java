import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many kilograms of pear did they buy? ");
        double pear = input.nextDouble();

        System.out.print("How many kilograms of apple did they buy? ");
        double apple = input.nextDouble();

        System.out.print("How many kilograms of tomatoes did they buy? ");
        double tomatoes = input.nextDouble();

        System.out.print("How many kilograms of banana did they buy? ");
        double banana = input.nextDouble();

        System.out.print("How many kilograms of eggplant did they buy? ");
        double eggplant = input.nextDouble();

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoesPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;
        double total = pearPrice * pear + applePrice * apple + tomatoesPrice * tomatoes + bananaPrice * banana + eggplantPrice * eggplant;

        System.out.println("Total cost: " + total + " TL");
    }
}
