package sk.kosickaakademia.lenart.tictactoe;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.printMatrix();
        switch (main.isWinner()){
            case 1:
                System.out.println("Player 1 wins.");
            case 2:
                System.out.println("Player 2 wins.");

        }

    }

    int[][] matrix = new int[][]{
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 2, 1, 2, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 2, 0, 0, 1, 1, 1, 2, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public int isWinner(){
        int i,j;
        for(i=0;i< matrix.length;i++){
            for(j=0;j< matrix[i].length;j++){
                if(j<=10 && matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3]*matrix[i][j+4]==1)
                    return 1;
                if(j<=10 && matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3]*matrix[i][j+4]==32)
                    return 2;
                if(i<=10 && matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j]*matrix[i+4][j]==1)
                    return 1;
                if(i<=10 && matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j]*matrix[i+4][j]==32)
                    return 2;
                if(j<=10 && i<=10 && matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3]*matrix[i+4][j+4]==1)
                    return 1;
                if(j<=10 && i<=10 && matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3]*matrix[i+4][j+4]==32)
                    return 2;
                if(j>=4 && i<=10 && matrix[i][j]*matrix[i+1][j-1]*matrix[i+2][j-2]*matrix[i+3][j-3]*matrix[i+4][j-4]==1)
                    return 1;
                if(j>=4 && i<=10 && matrix[i][j]*matrix[i+1][j-1]*matrix[i+2][j-2]*matrix[i+3][j-3]*matrix[i+4][j-4]==32)
                    return 2;
            }
        }
        return 0;
    }
    }

