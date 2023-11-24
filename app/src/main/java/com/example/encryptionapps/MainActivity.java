package com.example.encryptionapps;// MainActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.encryptionapps.MainActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getStartedButton = findViewById(R.id.getStarted);

        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start SecondActivity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // You can also pass data to the second activity using extras
                // intent.putExtra("key", "value");

                // Start the SecondActivity
                startActivity(intent);
            }
        });
    }
}
