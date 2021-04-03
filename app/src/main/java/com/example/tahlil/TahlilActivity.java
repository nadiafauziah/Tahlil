package com.example.tahlil;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class TahlilActivity extends AppCompatActivity {
    TextView txttitle, txtarabic, txttranslation;
    ApiInterface apiInterface;
    Activity activity;
    Tahlil tahlilnya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahlil);


        txttitle=(TextView)findViewById(R.id.txttitle);
        txtarabic=(TextView)findViewById(R.id.txtarabic);
        txttranslation=(TextView)findViewById(R.id.txttranslation);


        Intent dapet=getIntent();
        tahlilnya= (Tahlil) dapet.getSerializableExtra("baca");

        txttitle.setText(tahlilnya.getTitle());
        txtarabic.setText(tahlilnya.getArabic());
        txttranslation.setText(tahlilnya.getTranslation());

    }
}