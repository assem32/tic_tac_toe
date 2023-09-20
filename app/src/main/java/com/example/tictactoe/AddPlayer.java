package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tictactoe.databinding.ActivityAddPlayerBinding;

public class AddPlayer extends AppCompatActivity {
    ActivityAddPlayerBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddPlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPlayerOne = binding.xName.getText().toString();
                String getPlayerTwo = binding.oName.getText().toString();
                if (getPlayerOne.isEmpty() || getPlayerTwo.isEmpty()){
                    Toast.makeText(AddPlayer.this,"enter player name",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(AddPlayer.this, MainActivity.class);
                    intent.putExtra("playerOne",getPlayerOne);
                    intent.putExtra("playerTwo)",getPlayerTwo);
                    startActivity(intent);
                }

            }
        });
    }
}
