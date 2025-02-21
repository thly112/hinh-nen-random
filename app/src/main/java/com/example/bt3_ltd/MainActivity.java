package com.example.bt3_ltd;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    ArrayList<Integer> arrayImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.myLinearlayout);

        arrayImage = new ArrayList<>();
        arrayImage.add(R.drawable.img);
        arrayImage.add(R.drawable.img_1);
        arrayImage.add(R.drawable.img_2);
        arrayImage.add(R.drawable.img_3);

        Random random = new Random();
        int vt = random.nextInt(arrayImage.size());
        linearLayout.setBackgroundResource(arrayImage.get(vt));
    }
}