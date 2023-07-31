import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int choose;
        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("1. Cash deposit\n" +
                            "2. Withdrawal\n" +
                            "3. Check my balance\n" +
                            "4. Logout");
                    System.out.print("Please choose one of the options: ");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.print("Please enter the amount to add: ");
                            int add = input.nextInt();
                            balance += add;
                            break;
                        case 2:
                            System.out.print("Please enter the amount to get: ");
                            int get = input.nextInt();
                            if (get > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= get;
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                    }
                } while (choose != 4);
                System.out.println("You've logged out. See you!");
                break;
            } else {
                right--;
                System.out.println("Error: Wrong username or password! Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please reach out to your customer representative.");
                } else {
                    System.out.println("Left rights: " + right);
                }
            }
        }
    }
}