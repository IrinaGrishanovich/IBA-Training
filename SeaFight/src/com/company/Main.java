package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] SeaFight = new char[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                SeaFight[i][j] = '0';
            }
        }

        SeaFight[0][8] = '*';
        SeaFight[0][9] = '*';

        SeaFight[1][1] = '*';

        SeaFight[3][4] = '*';
        SeaFight[3][5] = '*';
        SeaFight[3][6] = '*';
        SeaFight[3][7] = '*';

        SeaFight[7][2] = '*';
        SeaFight[8][2] = '*';
        SeaFight[9][2] = '*';


        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(SeaFight[i][j]);
            }
            System.out.println();
        }
    }
}
