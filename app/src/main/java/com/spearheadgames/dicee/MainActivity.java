package com.spearheadgames.dicee;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;

        final ImageView image_leftDice;
        final ImageView image_rightDice;

        rollButton = (Button) findViewById(R.id.rollButton);
        image_leftDice = (ImageView) findViewById(R.id.image_leftDice);
        image_rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Roll button clicked.");

                Random randomNumberGenerator = new Random();
                int randomNumberLeft = randomNumberGenerator.nextInt(6);
                int randomNumberRightt = randomNumberGenerator.nextInt(6);

                image_leftDice.setImageResource(diceArray[randomNumberLeft]);
                image_rightDice.setImageResource(diceArray[randomNumberRightt]);

            }
        });

    }
}
