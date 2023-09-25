package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.OnNewIntentProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
;
        getSupportActionBar().hide();
        Button btn_jg = findViewById(R.id.bt_jg);

        btn_jg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });



    }
}