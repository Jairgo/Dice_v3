package com.example.dice_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Dice dado1, dado2;
    private Button btnGirar;
    private ImageView img1, img2;
    CountDownTimer cont;


    private int images[] = {R.drawable._1,
                            R.drawable._2,
                            R.drawable._3,
                            R.drawable._4,
                            R.drawable._5,
                            R.drawable._6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dado1 = new Dice();
        dado2 = new Dice();

        btnGirar = findViewById(R.id.btnGirar);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);

        CountDownTimer cont = new CountDownTimer(2000, 100) {
            @Override
            public void onTick(long l) {
                btnGirar.setEnabled(false);
                img1.setImageResource(images[dado1.girarDado() - 1]);
                img2.setImageResource(images[dado2.girarDado() - 1]);
            }

            @Override
            public void onFinish() {
                btnGirar.setEnabled(true);
            }
        };

        btnGirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont.start();
            }
        });

    }
}