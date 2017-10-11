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

        char[][] map = new char[2][2];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                
                map[i][j] = '@';
                
                System.out.println( i + "|" + Arrays.toString(map[0]));

            }

        }
    }
    
}
