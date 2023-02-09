package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;

public class tic_tac_toe {
    public static void main(String[] args) {
        char[][] board = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        boolean player1 = true;
        boolean player2 = false;
        boolean p1won = false;
        boolean p2won = false;


        while (!p1won || !p2won) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            if (player1) {
                System.out.println("Player 1's turn");
                int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the x coordinate"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the y coordinate"));
                if (board[x][y] == 'X' || board[x][y] == 'O') {
                    System.out.println("You can't place your piece there!");
                    continue;
                } else if (board[x][y] == '-') {
                    board[x][y] = 'X';
                    player1 = false;
                    player2 = true;
                }
            } else if (player2) {
                System.out.println("Player 2's turn");

                int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the x coordinate"));
                int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the y coordinate"));

                if (board[x][y] == 'X' || board[x][y] == 'O') {
                    System.out.println("You can't place your piece there!");
                    continue;
                } else if (board[x][y] == '-') {
                    board[x][y] = 'O';
                    player1 = true;
                    player2 = false;
                }
            }

            // check if someone won
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                    p1won = true;
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
                    p1won = true;
                    break;
                }
            }
            if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
                p1won = true;
            } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
                p1won = true;
            }

            for (int i = 0; i < 3; i++) {
                if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                    p2won = true;
                    break;
                }
            }
            for (int i = 0; i < 3; i++) {
                if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                    p2won = true;
                    break;
                }
            }
            if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
                p2won = true;
            } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
                p2won = true;
            }

            if (p1won) {
                System.out.println("Player 1 won!");
                break;
            } else if (p2won) {
                System.out.println("Player 2 won!");
                break;
            }
        }

    }
}
