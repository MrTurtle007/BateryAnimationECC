package com.example.bateryanimationecc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgSound;
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSound = (ImageView) findViewById(R.id.img_sound);
    }

    public void soundDown(View view) {
        if(count == 4){
            imgSound.setImageResource(R.drawable.ic_sound_3);
            count--;
        }
        else if(count == 3){
            imgSound.setImageResource(R.drawable.ic_sound_2);
            count--;
        }
        else if(count == 2){
            imgSound.setImageResource(R.drawable.ic_sound_1);
            count--;
        }
    }

    public void soundUp(View view) {
        if(count == 1){
            imgSound.setImageResource(R.drawable.ic_sound_2);
            count++;
        }
        else if(count == 2){
            imgSound.setImageResource(R.drawable.ic_sound_3);
            count++;
        }
        else if(count == 3){
            imgSound.setImageResource(R.drawable.ic_sound_4);
            count++;
        }
    }
}