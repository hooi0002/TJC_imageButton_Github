package com.example.tjc_imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView1;
    Button button1, button2;
    TextView textView;
    List<Integer> imagePath = new ArrayList<>();
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.Image1);
        button1 = findViewById(R.id.button_next);
        button2 = findViewById(R.id.button_previous);
        textView = findViewById(R.id.textView2);

        imagePath.add(R.drawable.pic1);
        imagePath.add(R.drawable.pic2);
        imagePath.add(R.drawable.pic3);
        imagePath.add(R.drawable.pic4);
        imagePath.add(R.drawable.pic5);

        index = 0;
        textView.setText(String.valueOf(index));
        imageView1.setImageResource(imagePath.get(0));

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    /*
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button_next) {
            index = index + 1;
        } else if (v.getId() == R.id.button_previous) {
            index = index - 1;
        }
        imageView1.setImageResource(imagePath.get(index));
        textView.setText(String.valueOf(index));
    }
    */

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_next) {
            if (index < imagePath.size()-1) {
                index = index + 1;
            } else {
                index = 0;
            }
        } else if (v.getId() == R.id.button_previous) {
            if (index <= 0) {
                index = 0;
            } else {
                index = index - 1;
            }
        }
        imageView1.setImageResource(imagePath.get(index));
        textView.setText(String.valueOf(index));
    }
}
