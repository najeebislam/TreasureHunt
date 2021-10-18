package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    static String[][] board = new String[5][5];

    public static void Board() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = "[]";
                System.out.print(board[i][j]);

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int coins = random.nextInt(100)+1;
        for (int i = 0; i < coins; i++) {
            //for (int j = 0; j < coins; j++) {

            //}
            board[i][j] =4;
        }

    }
}

