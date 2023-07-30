import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Guess the number: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Error: Please give a number between 0-100.");
                if (isWrong) {
                    right++;
                    System.out.println("You did wrong too much. Rights: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("When you did one more wrong, your rights get less.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("You won! Correct! The number: " + number);
                isWin = true;
                break;
            } else {
                System.out.print("Wrong! ");
                if (selected > number) {
                    System.out.println(selected + " is bigger than the number.");
                } else {
                    System.out.println(selected + " is smaller than the number.");
                }

                wrong[right++] = selected;
                System.out.println("Rights: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lost! ");
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }

    }
}
