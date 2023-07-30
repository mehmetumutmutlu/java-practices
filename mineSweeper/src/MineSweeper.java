import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row, col;
    String[][] mineMap;
    String[][] gameMap;
    int mineCount, count;
    int x, y;
    boolean isTrue = true;

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
        this.mineCount = (int) ((double) ((row * col) / 4));
    }

    public void mineMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    public void layMines() {
        Random rnd = new Random();
        int mineCounter = 0;
        while (mineCounter < this.mineCount) {
            int x = rnd.nextInt(this.row);
            int y = rnd.nextInt(this.row);
            if (!this.mineMap[x][y].equals("*")) {
                this.mineMap[x][y] = "*";
                mineCounter++;
            }
        }
    }

    public void printMineMap() {
        System.out.println("The mine map:");
        layMines();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (!this.mineMap[i][j].equals("*")) {
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printGameMap() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void chooseIndex() {
        Scanner input = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.println("Where do you want to sweep?");
            System.out.print("X Coordinate: ");
            y = input.nextInt() - 1;
            System.out.print("Y Coordinate: ");
            x = input.nextInt() - 1;
            if (x > row || y > col) {
                System.out.println("Hey! This is out of the map.");
                continue;
            }
            if (!(gameMap[x][y].equals("-") || gameMap[x][y].equals("F"))) {
                System.out.println("Hey! This is already opened.");
                continue;
            }
            if (mineMap[x][y].equals("*")) {
                System.out.println("Game Over!");
                break;
            }
            control();
            if (finish()) {
                System.out.println("Wow! You succeeded to survive.");
                break;
            }
        }
    }

    public void flag() {
        Scanner input = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.println("Where do you want to flag?");
            System.out.print("X Coordinate: ");
            y = input.nextInt() - 1;
            System.out.print("Y Coordinate: ");
            x = input.nextInt() - 1;
            if (x > row || y > col) {
                System.out.println("Hey! This is out of the map.");
                continue;
            }
            if (gameMap[x][y].equals("-")) {
                this.gameMap[x][y] = "F";
                printGameMap();
            } else if (gameMap[x][y].equals("F")) {
                this.gameMap[x][y] = "-";
                printGameMap();
            } else {
                System.out.println("Invalid coordinate!");
                continue;
            }
            break;
        }
    }

    public void control() {
        count = 0;
        for (int i = (x - 1); i <= (x + 1); i++) {
            for (int j = (y - 1); j <= (y + 1); j++) {
                if (i < 0 || j < 0 || i >= this.row || j >= this.col) {
                    continue;
                }
                if (this.mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[x][y] = String.valueOf(count);
        this.mineMap[x][y] = String.valueOf(count);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sweep a coordinate\n2. Flag");
        System.out.print("What do you want? ");
        int preference = input.nextInt();
        if (preference == 1) {
            chooseIndex();
        } else if (preference == 2) {
            flag();
        } else {
            System.out.println("Invalid!");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (this.mineMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void run() {
        mineMap();
        layMines();
        System.out.println("==================================");
        System.out.println("Welcome to the Mine Sweeper Game!");
        System.out.println("==================================");
        printGameMap();
        chooseIndex();
    }
}