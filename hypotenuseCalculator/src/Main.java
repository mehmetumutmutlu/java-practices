import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the length of the first cathetus of the triangle: ");
        int a = input.nextInt();
        System.out.print("Please enter the length of the second cathetus of the triangle: ");
        int b = input.nextInt();

        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        double perimeter = 2 * u;
        double square = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("The length of the hypotenuse: " + c);
        System.out.println("The perimeter of the triangle: " + perimeter);
        System.out.println("The square of the triangle: " + square);
    }
}
