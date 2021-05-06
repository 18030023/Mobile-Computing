package com.example.myuts_18030023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nim, nama;
    RadioButton AB;
    RadioGroup kelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nim = (EditText) findViewById(R.id.editNIM);
        nama = (EditText) findViewById(R.id.nama);

        //Radio Button
        kelas = (RadioGroup) findViewById(R.id.pilihanKelas);


    }

    public void kirimData(View view) {

        int radioId = kelas.getCheckedRadioButtonId();
        AB = (RadioButton) findViewById(radioId);

        Intent skuy = new Intent( this, HasilActivity.class);
        skuy.putExtra("nim", nim.getText().toString());
        skuy.putExtra("nama", nama.getText().toString());
        skuy.putExtra("AB", AB.getText().toString());
        startActivity(skuy);

    }
}