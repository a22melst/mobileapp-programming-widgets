package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Profilbild
    ImageView imageView;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Profilbild
        imageView = findViewById(R.id.imageView);
        drawable = getResources().getDrawable(R.drawable.profilepic);
        imageView.setImageDrawable(drawable);
    }
}
