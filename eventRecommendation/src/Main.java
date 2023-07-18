import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the degree of the weather (C)? ");
        int weather = input.nextInt();

        if (weather < 5) {
            System.out.println("You can go skiing.");
        } else if (weather < 15) {
            System.out.println("You can go to cinema.");
        } else if (weather < 25) {
            System.out.println("You can go to picnic.");
        } else {
            System.out.println("You can go swimming.");
        }
    }
}
