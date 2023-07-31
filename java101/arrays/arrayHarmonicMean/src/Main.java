public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int i = 1; i < numbers.length; i++) {
            sum += (double) 1 / i;
        }

        System.out.println(numbers.length / sum);
    }
}