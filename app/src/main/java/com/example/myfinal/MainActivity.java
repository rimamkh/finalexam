package com.example.myfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private  Rectangle customeView;
    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customeView = findViewById(R.id.custom);
        change = findViewById(R.id.change);
        //change=findViewById(R.id.button);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customeView.swapcolor();
            }
        });
    }

}