package com.example.skygreen.lat2_akb2_10116063_imamsatriyadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
/*
 * NIM       :  10116063
 * Nama      :  Imam Satriyadi
 * KElas     :  IF-2
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 12:30
 * MEMBUAT LAYOUT REGISTER
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 14:30
 * SELESAI MEMBUAT LAYOUT REGISTER
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 22:16
 * MENGHUBUNGKAN LAYOUT REGISTER KE LAYOUT ALMOST THERE
 * */
public class Register extends AppCompatActivity {
    Button btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_register    =  findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almost_there_nav();
            }
        });
    }

    public void almost_there_nav(){
        Intent intent   = new Intent(this, AlmostThere.class);
        startActivity(intent);
    }
}
