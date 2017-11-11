/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Arrays;

/**
 *
 * @author Javier Delgado
 */
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] map = new int[9][9];

        /* Creating the numbers on the grid */
        for (int row = 0; row < map.length; row++) {
            System.out.println(row + "|");
            for (int col = 0; col < map[row].length; col++) {
                if (map[row][col] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(map[row][col]);
                }
            }
            System.out.println("|" + row);
        }

    }

}
