package com.haritsdeveloper.menghitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class hitungpersegiActivity extends AppCompatActivity {
    EditText edtpersegi;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitungpersegi);
        edtpersegi = findViewById(R.id.edt_sisi);
        tvHasil = findViewById(R.id.tv_hasil);
    }


    public void hitungKeliling(View view) {
        int sisi = Integer.parseInt(edtpersegi.getText().toString());
        int keliling = 4* sisi ;

        tvHasil.setText(String.valueOf(keliling));
    }

    public void hitungLuas(View view) {
        int sisi = Integer.parseInt(edtpersegi.getText().toString());
        int luas = sisi*sisi ;

        tvHasil.setText(String.valueOf(luas));

    }
}
