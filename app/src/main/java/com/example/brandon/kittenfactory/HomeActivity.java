package com.example.brandon.kittenfactory;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {
    MediaPlayer homeSound;

    private Button startGame;
    private Button viewInstructions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeSound = MediaPlayer.create(this, R.raw.home_music);
        homeSound.start();
        startGame = (Button)findViewById(R.id.start_btn);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
        });
        viewInstructions = (Button)findViewById(R.id.instruction_btn);
        viewInstructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewInstructions();
            }
        });
    }
    private void startGame(){
        homeSound.stop();
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void viewInstructions() {
        homeSound.stop();
        Intent intent = new Intent(this, InstructionActivity.class);
        startActivity(intent);
    }

}
