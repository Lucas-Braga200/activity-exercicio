package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView plainTextName;
    Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plainTextName = findViewById(R.id.plainTextName);
        buttonConfirm = findViewById(R.id.buttonConfirm);
    }

    public void confirmEvent(View view) {
        String name = plainTextName.getText().toString();
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}