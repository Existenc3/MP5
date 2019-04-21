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

        setUpList();
        GridView gridView = (GridView) findViewById(R.id.gridView);
        GridViewAdapter adapter = new GridViewAdapter(lstSource, this);
        gridView.setAdapter(adapter);


        /*
        TextView myFirst =  (TextView) findViewById((R.id.firstText));
        myFirst.setText("Fuck Yeah!");
        createBoard(); */
    }

    private void setUpList() {
        for(String item:array_characters) {
            lstSource.add(item);
        }
    }

    private void createBoard() {
        LinearLayout layout = new LinearLayout(this);
    }
}
