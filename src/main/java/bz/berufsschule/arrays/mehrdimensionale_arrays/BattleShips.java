package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;
import java.util.Arrays;

public class BattleShips {
    public static void main(String[] args) {
        // 10x10 array
        char[][] sea1 = new char[10][10];

        // fill sea1 with ~
        for (char[] chars : sea1) {
            Arrays.fill(chars, '~');
        }


        boolean win = false;
        int player1_little_ships = 1;
        int player1_big_ships = 1;

        while (!win){
            // print sea1 with coordinates
            for (int i = 0; i < sea1.length; i++) {
                for (int j = 0; j < sea1[i].length; j++) {
                    System.out.print(sea1[i][j] + " ");
                }
                System.out.println();
            }
            // player 1 insert coordinates for little ship
            int x = Integer.parseInt(JOptionPane.showInputDialog("Player 1: Enter the x coordinate for your little ship"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Player 1: Enter the y coordinate for your little ship"));
            if (sea1[x][y] == 'X' || sea1[x][y] == 'O') {
                System.out.println("You can't place your piece there!");
                continue;
            } else if (sea1[x][y] == '~') {
                sea1[x][y] = 'X';
            }
            // player 1 insert coordinates for big ship
            int x2 = Integer.parseInt(JOptionPane.showInputDialog("Player 1: Enter the x coordinate for your big ship"));
            int y2 = Integer.parseInt(JOptionPane.showInputDialog("Player 1: Enter the y coordinate for your big ship"));
            if (sea1[x2][y2] == 'X' || sea1[x2][y2] == 'O') {
                System.out.println("You can't place your piece there!");
                continue;
            } else if (sea1[x2][y2] == '~') {
                sea1[x2][y2] = 'X';
            }

        }
    }
}