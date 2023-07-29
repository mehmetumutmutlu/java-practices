import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int[] sorted = Arrays.copyOf(list, list.length);
        Arrays.sort(sorted);

        int nearestMin = sorted[sorted.length - 1];
        int nearestMax = sorted[0];

        for (int i : sorted) {
            if ((i < n) && (i > nearestMax)) {
                nearestMax = i;
            }
            if ((i > n) && (i < nearestMin)) {
                nearestMin = i;
            }
        }

        System.out.println("The array: " + Arrays.toString(list));
        System.out.println("The given number: " + n);
        System.out.println("The nearest max: " + nearestMax);
        System.out.println("The nearest min: " + nearestMin);

    }
}