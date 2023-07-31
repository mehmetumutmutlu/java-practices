public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int factor = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j == 0)) {
                    factor++;
                }
            }
            if (factor == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
