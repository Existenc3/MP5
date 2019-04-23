package com.example.mp5;

import android.graphics.Color;
import android.widget.Button;

public class Board {

    public boolean whiteTurn = true;

    public Cell[][] allCells = new Cell[8][8];

    Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                allCells[i][j] = new Cell(this, i, j);
            }
        }
    }

    public void buttonClick(int posX, int posY) {
        // The buttons aren't always equal for some reason.
        /* if (!(allCells[posX][posY]).button.equals(button)) {
            System.out.println("not equal???");
        } */
        System.out.println("Button at " + posX + ", " + posY + " clicked.");
        allCells[posX][posY].button.setBackgroundColor(Color.RED);
    }
}
