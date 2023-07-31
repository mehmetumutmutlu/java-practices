import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please type the radius: ");
        int r = input.nextInt();

        System.out.print("Please type the degree of the center angle: ");
        double alpha = input.nextDouble();

        double pi = 3.14;

        double circumference = 2 * pi * r;
        double area = pi * r * r;
        double areaOfSlice = (pi * (r * r) * alpha) * 360;

        System.out.println("The circumference: " + circumference);
        System.out.println("The area: " + area);
        System.out.println("The area of the slice: " + areaOfSlice);
    }
}
