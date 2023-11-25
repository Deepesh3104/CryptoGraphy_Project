package com.example.encryptionapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DecryptionsActivity3 extends AppCompatActivity {
    EditText etdec;
    TextView dectv;
    ClipboardManager cplboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decryptions3);

        etdec = findViewById(R.id.etdec);
        dectv = findViewById(R.id.dectv);
        cplboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void dec(View view) {
        String encryptedText = etdec.getText().toString();
        String decryptedText = decode.dec(encryptedText); // Assuming you have a decode class
        dectv.setText(decryptedText);
    }

    public void cp1(View view) {
        String data = dectv.getText().toString().trim();
        if (!data.isEmpty()) {
            ClipData clipData = ClipData.newPlainText("text", data);
            cplboard.setPrimaryClip(clipData);
            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show();
        }
    }
}
