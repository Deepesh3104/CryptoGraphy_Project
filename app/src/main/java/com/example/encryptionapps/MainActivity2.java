package com.example.encryptionapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Find the TextView by its id
        TextView encodeTextView = findViewById(R.id.encodes);

        // Set an OnClickListener for the TextView
        encodeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the next activity
                Intent intent = new Intent(MainActivity2.this, EncryptionsActivity3.class);

                // You can also pass data to the next activity using extras
                // intent.putExtra("key", "value");

                // Start the next activity
                startActivity(intent);
            }
        });

        TextView decodeTextView = findViewById(R.id.decodes);

        // Set an OnClickListener for the TextView
        decodeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to start the next activity
                Intent intent = new Intent(MainActivity2.this, DecryptionsActivity3.class);

                // You can also pass data to the next activity using extras
                // intent.putExtra("key", "value");

                // Start the next activity
                startActivity(intent);
            }
        });
    }
}
