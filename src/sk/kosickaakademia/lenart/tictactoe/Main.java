package sk.kosickaakademia.lenart.tictactoe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        while (main.isWinner() != 1 || main.isWinner() != 2) {
            if (main.isWinner() != 1) {
                System.out.println("Player 1 turn. Select x,y:");
                main.player1();
                main.printMatrix();
            }else{
                break;
            }
            if (main.isWinner() != 2) {
                System.out.println("Player 2 turn. Select x,y:");
                main.player2();
                main.printMatrix();
            }else{
                break;
            }

        }
        switch (main.isWinner()) {
            case 1:
                System.out.println("Player 1 wins.");
                break;
            case 2:
                System.out.println("Player 2 wins.");
                break;
        }
    }

    int[][] matrix = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},

    };

    void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public int isWinner() {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                if (j <= (matrix[i].length-5) && matrix[i][j] * matrix[i][j + 1] * matrix[i][j + 2] * matrix[i][j + 3] * matrix[i][j + 4] == 1)
                    return 1;
                if (i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j] * matrix[i + 2][j] * matrix[i + 3][j] * matrix[i + 4][j] == 1)
                    return 1;
                if (j <= (matrix[i].length-5) && i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j + 1] * matrix[i + 2][j + 2] * matrix[i + 3][j + 3] * matrix[i + 4][j + 4] == 1)
                    return 1;
                if (j >= 4 && i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j - 1] * matrix[i + 2][j - 2] * matrix[i + 3][j - 3] * matrix[i + 4][j - 4] == 1)
                    return 1;
                if (j <= (matrix[i].length-5) && matrix[i][j] * matrix[i][j + 1] * matrix[i][j + 2] * matrix[i][j + 3] * matrix[i][j + 4] == 32)
                    return 2;
                if (i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j] * matrix[i + 2][j] * matrix[i + 3][j] * matrix[i + 4][j] == 32)
                    return 2;
                if (j <= (matrix[i].length-5) && i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j + 1] * matrix[i + 2][j + 2] * matrix[i + 3][j + 3] * matrix[i + 4][j + 4] == 32)
                    return 2;
                if (j >= 4 && i <= (matrix.length-5) && matrix[i][j] * matrix[i + 1][j - 1] * matrix[i + 2][j - 2] * matrix[i + 3][j - 3] * matrix[i + 4][j - 4] == 32)
                    return 2;
            }
        }
        return 0;
    }

    public void player1() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt()-1;
        int y = scanner.nextInt()-1;
        if (matrix[x][y] == 0) {
            matrix[x][y] = 1;
        } else {
            System.out.println("place is not empty");
        }

    }

    public void player2() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt()-1;
        int y = scanner.nextInt()-1;
        if (matrix[x][y] == 0) {
            matrix[x][y] = 2;
        } else {
            System.out.println("place is not empty");
        }
    }
}