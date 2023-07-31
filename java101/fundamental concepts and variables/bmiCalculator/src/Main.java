import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your height (meter): ");
        double height = input.nextDouble();

        System.out.print("Your weight (kilogram): ");
        double weight = input.nextDouble();

        double bmi = weight / height * height;

        System.out.println("Your BMI: " + bmi);
    }
}
