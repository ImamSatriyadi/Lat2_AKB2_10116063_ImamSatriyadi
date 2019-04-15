package com.example.skygreen.lat2_akb2_10116063_imamsatriyadi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
* NIM       :  10116063
* Nama      :  Imam Satriyadi
* KElas     :  IF-2
*
* CHANGE LOG : SABTU 13 APRIL 2019 09:00
* START MEMBUAT LAYOUT LOGIN
*
* CHANGE LOG : SABTU 13 APRIL 2019 11:00
* SELESAI MEMBUAT LAYOUT LOGIN
*
* CHANGE LOG : SABTU 13 APRIL 2019 14:30
* MENGHUBUNGKAN LAYOUT LOGIN KE LAYOUT REGISTER
* */

public class MainActivity extends AppCompatActivity {
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register    = findViewById(R.id.txt_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register_nav();
            }
        });
    }

    public void register_nav(){
        Intent intent  = new Intent(this, Register.class);
        startActivity(intent);
    }
}
