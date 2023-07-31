import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int count = input.nextInt();

        int[] arr = new int[count];

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". number: ");
            int n = input.nextInt();
            arr[i - 1] = n;
        }

        Arrays.sort(arr);

        String string = Arrays.toString(arr);
        System.out.println(string);
    }
}
