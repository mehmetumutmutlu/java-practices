import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = input.nextInt();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Which operator do you want? ");
        int operator = input.nextInt();

        switch (operator) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Error: Divide by zero");
                        break;
                    default:
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
