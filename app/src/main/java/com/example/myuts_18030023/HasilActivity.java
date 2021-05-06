package com.example.myuts_18030023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = (TextView) findViewById(R.id.nimUser);
        txt2 = (TextView) findViewById(R.id.namaUser);
        txt3 = (TextView) findViewById(R.id.pilKelas);

        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");
        String kelas = getIntent().getExtras().getString("AB");

        txt1.setText("Nama Mahasiswa \n"+nama );
        txt2.setText("Nim Mahasiswa \n"+nim );
        txt3.setText("Kelas \n"+kelas);

    }
}