import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String horoscope = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Which year were you born in? ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Rooster";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Rat";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Goat";
                break;
            default:
                System.out.print("Error: Invalid year.");
        }

        System.out.print("You're a " + horoscope + " in China Zodiac.");
    }
}
