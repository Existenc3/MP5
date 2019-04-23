package com.example.mp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Board board;

    String[] array_characters = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y",
            "z"
    };

    List<String> lstSource = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createBoard();
        setUpList();
        GridView gridView = findViewById(R.id.gridView);
        GridViewAdapter adapter = new GridViewAdapter(board, lstSource, this);
        gridView.setAdapter(adapter);


        /*
        TextView myFirst =  (TextView) findViewById((R.id.firstText));
        myFirst.setText("Fuck Yeah!"); */
    }

    private void setUpList() {
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                lstSource.add(x + ", " + y);
            }
        }
        /*
        for(String item:array_characters) {
            lstSource.add(item);
        } */
    }

    private void createBoard() {
        board = new Board();
    }
}
