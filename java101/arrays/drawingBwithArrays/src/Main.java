public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[5][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 1 || j == 4) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
            letter[0][4] = " ";
            letter[2][4] = " ";
            letter[4][4] = " ";
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}