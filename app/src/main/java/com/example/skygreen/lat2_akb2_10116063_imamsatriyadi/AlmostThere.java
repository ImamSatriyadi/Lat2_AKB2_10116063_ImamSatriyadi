package com.example.skygreen.lat2_akb2_10116063_imamsatriyadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * NIM       :  10116063
 * Nama      :  Imam Satriyadi
 * KElas     :  IF-2
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 15:30
 * MEMBUAT LAYOUT ALMOST THERE
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 18:30
 * SELESAI MEMBUAT LAYOUT ALMOST THERE
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 22:33
 * MENGHUBUNGKAN LAYOUT ALMOST THERE KE LAYOUT VERIFY ACCOUNT
 * */
public class AlmostThere extends AppCompatActivity {
    Button btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        btn_verify  = findViewById(R.id.btn_verify);
        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify_nav();
            }
        });
    }

    public void verify_nav(){
        Intent intent   = new Intent(this, VerifyAccount.class);
        startActivity(intent);
    }
}
