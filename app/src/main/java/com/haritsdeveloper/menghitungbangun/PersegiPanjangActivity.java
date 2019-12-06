package com.haritsdeveloper.menghitungbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);
        // Hubungkan widget id layout
        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        tvHasil =findViewById(R.id.tv_hasil);
    }

    public void btn_hitung_keliling(View view) {
        int p = Integer.parseInt(edtPanjang.getText().toString());
        int l = Integer.parseInt(edtLebar.getText().toString());
        int keliling = (p + l)* 2 ;

        tvHasil.setText(String.valueOf(keliling));
    }

    public void btn_hitung_luas(View view) {
        int p = Integer.parseInt(edtPanjang.getText().toString());
        int l = Integer.parseInt(edtLebar.getText().toString());
        int luas = p * l ;

        tvHasil.setText(String.valueOf(luas));
    }
}
