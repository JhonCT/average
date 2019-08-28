package com.example.promedio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.View{
    private Main.Presenter averagePresenter;
    private EditText edtNote1;
    private EditText edtNote2;
    private EditText edtNote3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        averagePresenter = new AveragePresenter(this);
    }

    public void showResult(View view) {
        edtNote1 = findViewById(R.id.edt_note1);
        edtNote2 = findViewById(R.id.edt_note2);
        edtNote3 = findViewById(R.id.edt_note3);

        int note1 = Integer.parseInt(edtNote1.getText().toString());
        int note2 = Integer.parseInt(edtNote2.getText().toString());
        int note3 = Integer.parseInt(edtNote3.getText().toString());

        averagePresenter.calculateAverage(note1, note2, note3);
    }

    @Override
    public void showResult(String result) {
        Toast.makeText(getApplicationContext(), "Promedio: " + result, Toast.LENGTH_LONG).show();
    }
}
