import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please give a year: ");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
