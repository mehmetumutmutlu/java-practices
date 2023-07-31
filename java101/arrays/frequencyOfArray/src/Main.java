public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};


        for (int i = 0; i < list.length; i++) {
            int count = 0;
            boolean isCount = false;

            for (int j = i - 1; j >= 0; --j) {
                if (list[j] == list[i]) {
                    isCount = true;
                    break;
                }
            }

            if (!isCount) {
                for (int j : list) {
                    if (list[i] == j) {
                        count++;
                    }
                }
            }

            if (count >= 2) {
                System.out.println(list[i] + " repeats: " + count);
            }
        }
    }
}
