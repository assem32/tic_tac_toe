package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Dialoge extends Dialog {


    String message;
    MainActivity mainActivity;
    public Dialoge(Context context,String message,MainActivity mainActivity){
        super(context);
//        this.message=message;
        this.mainActivity=mainActivity;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView result=findViewById(R.id.result);
        Button again=findViewById(R.id.btn_again);
//        result.setText(message);
        again.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mainActivity.matchRestart();
                        dismiss();
                    }
                }
        );
    }
}
