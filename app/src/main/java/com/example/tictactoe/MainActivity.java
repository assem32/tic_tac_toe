package com.example.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tictactoe.databinding.ActivityAddPlayerBinding;
import com.example.tictactoe.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    int b1=5,b2=5,b3=5,b4=5,b5=5,b6=5,b7=5,b8=5,b9=5;
    int xCount=0,yCount=0,i=0;

    private  String startGame="X";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.box1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box1.setImageResource(R.drawable.ximage);
                            b1=1;
                            i++;
                        }
                        else if(startGame=="O"){
                            binding.box1.setImageResource(R.drawable.oimage);
                            b1=0;
                            i++;
                        }

                        choosePlayer();
                        winningGame();
                    }

                }
        );
        binding.rest.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        matchRestart();

                    }
                }
        );
        binding.box2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box2.setImageResource(R.drawable.ximage);
                            b2=1;
                            i++;
                        }
                        else {
                            binding.box2.setImageResource(R.drawable.oimage);
                            b2=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );

        binding.box3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box3.setImageResource(R.drawable.ximage);
                            b3=1;
                            i++;
                        }
                        else {
                            binding.box3.setImageResource(R.drawable.oimage);
                            b3=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );

        binding.box4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box4.setImageResource(R.drawable.ximage);
                            b4=1;
                            i++;
                        }
                        else {
                            binding.box4.setImageResource(R.drawable.oimage);
                            b4=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );

        binding.box5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box5.setImageResource(R.drawable.ximage);
                            b5=1;
                            i++;
                        }
                        else {
                            binding.box5.setImageResource(R.drawable.oimage);
                            b5=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );


        binding.box6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box6.setImageResource(R.drawable.ximage);
                            b6=1;
                            i++;
                        }
                        else {
                            binding.box6.setImageResource(R.drawable.oimage);
                            b6=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );

        binding.box7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box7.setImageResource(R.drawable.ximage);
                            b7=1;
                            i++;
                        }
                        else {
                            binding.box7.setImageResource(R.drawable.oimage);
                            b7=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );
        binding.box8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box8.setImageResource(R.drawable.ximage);
                            b8=1;
                            i++;
                        }
                        else {
                            binding.box8.setImageResource(R.drawable.oimage);
                            b8=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );
        binding.box9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(startGame=="X"){
                            binding.box9.setImageResource(R.drawable.ximage);
                            b9=1;
                            i++;
                        }
                        else {
                            binding.box9.setImageResource(R.drawable.oimage);
                            b9=0;
                            i++;
                        }
                        choosePlayer();
                        winningGame();
                    }
                }
        );


    }

    private  void choosePlayer(){
        if(startGame=="X"){
            startGame="O";
        }
        else {
            startGame="X";
        }
    }

    private void winningGame(){
        if(b1==1 && b2 ==1 && b3==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b4==1 && b5 ==1 && b6==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b7==1 && b8 ==1 && b9==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b1==1 && b4 ==1 && b7==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b2==1 && b5 ==1 && b8==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b3==1 && b6 ==1 && b9==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b1==1 && b5 ==1 && b9==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b3==1 && b5 ==1 && b7==1){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("X player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            xCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);

        }





        if(b1==0 && b2 ==0 && b3==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b4==0 && b5 ==0 && b6==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b7==0 && b8 ==0 && b9==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b1==0 && b4 ==0 && b7==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b2==0 && b5 ==0 && b8==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b3==0 && b6 ==0 && b9==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b1==0 && b5 ==0 && b9==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);
        }
        if(b3==0 && b5 ==0 && b7==0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("O player wins").setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    matchRestart();
//                    restValues();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            yCount++;
            startGame="X";
            binding.player1.setText("Player 1: "+xCount);
            binding.player2.setText("Player 2: "+yCount);

        }

    }
    public void matchRestart(){
        binding.box1.setImageResource(R.drawable.white_box);
        binding.box2.setImageResource(R.drawable.white_box);
        binding.box3.setImageResource(R.drawable.white_box);
        binding.box4.setImageResource(R.drawable.white_box);
        binding.box5.setImageResource(R.drawable.white_box);
        binding.box6.setImageResource(R.drawable.white_box);
        binding.box7.setImageResource(R.drawable.white_box);
        binding.box8.setImageResource(R.drawable.white_box);
        binding.box9.setImageResource(R.drawable.white_box);
        restValues();

    }

    private void restValues(){
         b1=5;
         b2=5;
         b3=5;
         b4=5;
         b5=5;
         b6=5;
         b7=5;
         b8=5;
         b9=5;
    }
}