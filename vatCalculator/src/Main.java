import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the price: ");
        double price = input.nextDouble();

        double vat = price > 1000 ? 0.08 : 0.18;

        System.out.println("Price: " + price);
        System.out.println("The VAT rate: " + vat);
        System.out.println("The VAT cost: " + price * vat);
        System.out.println("TOTAL PRICE (including VAT): " + (price + (price * vat)));
    }
}
