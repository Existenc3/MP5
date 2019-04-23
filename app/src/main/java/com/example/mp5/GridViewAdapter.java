package com.example.mp5;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;
import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    public List<String> created = new ArrayList<>();

    public Board board;

    List<String> lstSource;
    Context mContext;

    public GridViewAdapter(Board setBoard, List<String> lstSource, Context mContext) {
        this.board = setBoard;
        this.lstSource = lstSource;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return lstSource.size();
    }

    @Override
    public Object getItem(int position) {
        return lstSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("GetView called with position: " + position);
        if (convertView == null) {
            System.out.println("ConvertView null");
        }
        final Button button;
        if (convertView == null) {
            // For some reason it was creating to buttons at position 0, this if condition seems to
            // fix it. Ok it fixes it but it makes the buttons on the bottom too short for some
            // reason.
            /* if (created.contains(Integer.toString(position))) {
                return new Button(mContext);
            } */

            final int posX = position % 8;
            final int posY = 7 - (position / 8);

            button = new Button(mContext);
            button.setLayoutParams(new GridView.LayoutParams(150, 150));
            button.setPadding(0, 0, 0, 0);
            button.setText(Integer.toString(posX) + ", " + Integer.toString(posY));
            board.allCells[posX][posY].setButton(button);
            button.setBackgroundColor(Color.DKGRAY);
            button.setTextColor(Color.YELLOW);
            created.add(Integer.toString(position));
            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                board.buttonClick(posX, posY);
            }
        });
        } else {
            button = (Button) convertView;
        }
        return button;
    }
}
