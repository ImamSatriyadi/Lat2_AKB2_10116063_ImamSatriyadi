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
 * CHANGE LOG : SABTU 13 APRIL 2019 18:30
 * MEMBUAT LAYOUT VERIFY ACCOUNT
 *
 * CHANGE LOG : SABTU 13 APRIL 2019 22:33
 * SELESAI MEMBUAT LAYOUT VERIFY ACCOUNT
 *
 * CHANGE LOG : MINGGU 14 APRIL 2019 13:00
 * MENGHUBUNGKAN LAYOUT VERIFY ACCOUNT KE LAYOUT USER HOME
 * */
public class VerifyAccount extends AppCompatActivity {
    Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        btn_send    = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user_home_nav();
            }
        });
    }

    public void user_home_nav(){
        Intent intent   = new Intent(this, UserHome.class);
        startActivity(intent);
    }
}
