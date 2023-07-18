import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String horoscope = "";
        boolean isMonthError = false;
        boolean isDayError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Which month were you born in? (numerically): ");
        int month = input.nextInt();
        System.out.print("Which day of the month were you born? (numerically): ");
        int day = input.nextInt();

        if (month == 1){
            if ((day >= 1) && (day <= 31)) {
                if (day < 20) {
                    horoscope = "Capricornus";
                } else {
                    horoscope = "Aquarius";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 2) {
            if ((day >= 1) && (day <= 29)) {
                if (day < 19) {
                    horoscope = "Aquarius";
                } else {
                    horoscope = "Pisces";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 3) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 20) {
                    horoscope = "Pisces";
                } else {
                    horoscope = "Aries";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 4) {
            if ((day >= 1) && (day <= 30)) {
                if (day < 20) {
                    horoscope = "Aries";
                } else {
                    horoscope = "Taurus";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 5) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 21) {
                    horoscope = "Taurus";
                } else {
                    horoscope = "Gemini";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 6) {
            if ((day >= 1) && (day <= 30)) {
                if (day < 22) {
                    horoscope = "Gemini";
                } else {
                    horoscope = "Cancer";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 7) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 23) {
                    horoscope = "Cancer";
                } else {
                    horoscope = "Lwo";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 8) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 23) {
                    horoscope = "Leo";
                } else {
                    horoscope = "Virgo";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 9) {
            if ((day >= 1) && (day <= 30)) {
                if (day < 23) {
                    horoscope = "Virgo";
                } else {
                    horoscope = "Libra";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 10) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 22) {
                    horoscope = "Libra";
                } else {
                    horoscope = "Scorpius";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 11) {
            if ((day >= 1) && (day <= 30)) {
                if (day < 20) {
                    horoscope = "Scorpius";
                } else {
                    horoscope = "Sagittarius";
                }
            } else {
                isDayError = true;
            }
        } else if (month == 12) {
            if ((day >= 1) && (day <= 31)) {
                if (day < 20) {
                    horoscope = "Sagittarius";
                } else {
                    horoscope = "Capricornus";
                }
            } else {
                isDayError = true;
            }
        } else {
            isMonthError = true;
        }

       if (isMonthError) {
           System.out.println("Error: Invalid month!");
       } else if (isDayError) {
           System.out.println("Error: Invalid day!");
       } else {
           System.out.println("You are a " + horoscope + ".");
       }
    }
}