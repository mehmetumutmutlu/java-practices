import java.util.Scanner;

public class JavaPatika {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("The result: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("The result: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("The result: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Error: No numbers cannot be divided by zero.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("The result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the base: ");
        int base = scan.nextInt();
        System.out.print("Please enter the exponent: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("The result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("The result: " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n1 = scan.nextInt();
        System.out.print("Please enter the second number: ");
        int n2 = scan.nextInt();
        int result = 0;

        if (n2 == 0) {
            System.out.println("Error: No numbers cannot be divided by zero.");
        } else {
            result = n1 % n2;
        }

        System.out.println("The result: " + result);
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the length of the short edge: ");
        int shortEdge = scan.nextInt();
        System.out.print("Please enter the length of the long edge: ");
        int longEdge = scan.nextInt();

        System.out.println("The perimeter: " + (shortEdge + longEdge) * 2);
        System.out.println("The area: " + shortEdge * longEdge);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = """
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Power
                6. Factorial
                7. Mod
                8. Rectangle Area and Perimeter
                0. Exit""";

        do {
            System.out.println(menu);
            System.out.print("Please choose an operator: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Error: Invalid value. Please try again.");
            }
        } while (select != 0);


    }
}