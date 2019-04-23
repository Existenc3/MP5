package com.example.mp5;

import android.media.Image;
import android.view.View;
import android.widget.Button;

import com.example.mp5.Pieces.BasePiece;

public class Cell {
    public Board board;
    public Button button;
    public int posX;
    public int posY;
    public String sprite;
    public BasePiece piece = null;

    Cell(Board setBoard, int setPosX, int setPosY) {
        board = setBoard;
        posX = setPosX;
        posY = setPosY;
    }

    public void setButton(Button setButton) {
        this.button = setButton;
    }
    public String getPiece() {
        return this.sprite;
    }
    public void setPiece(String toSet) {
        this.sprite = toSet;
        this.button.setText(toSet);
    }
}
