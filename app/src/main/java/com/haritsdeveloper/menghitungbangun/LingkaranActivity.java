package com.haritsdeveloper.menghitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {
    EditText edtJArijari;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        edtJArijari = findViewById(R.id.edt_jarijari);
        tvHasil = findViewById(R.id.tv_hasil);
    }


    public void hitungKeliling(View view) {
        double r = Double.parseDouble(edtJArijari.getText().toString());
        double keliling = (22 *2 * r)/7;

        tvHasil.setText(String.valueOf(keliling));
    }

    public void hitungLuas(View view) {
        double r = Double.parseDouble(edtJArijari.getText().toString());
        double luas = (22 * r * r)/7;

        tvHasil.setText(String.valueOf(luas));
    }
}
