package com.example.tahlil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ObjekBesar objekBesar;
    List<Tahlil> tahlil;
    ApiInterface apiInterface;
    RecyclerView rvTahlil;
    RecyclerView.LayoutManager Layoutnya;
    AdapterTahlil adapterTahlilnya;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTahlil=(RecyclerView) findViewById(R.id.txt_home);
        Layoutnya=new LinearLayoutManager(this);
        rvTahlil.setLayoutManager(Layoutnya);
        apiInterface=ApiClient.ambilData().create(ApiInterface.class);
        Call<ObjekBesar> call=apiInterface.ambilData();
        call.enqueue(new Callback<ObjekBesar>() {
            @Override
            public void onResponse(Call<ObjekBesar> call, Response<ObjekBesar> response) {
                objekBesar=response.body();
                tahlil=objekBesar.getData();
                adapterTahlilnya=new AdapterTahlil(tahlil, MainActivity.this);
                rvTahlil.setAdapter(adapterTahlilnya);
            }

            @Override
            public void onFailure(Call<ObjekBesar> call, Throwable t) {

            }
        });

     }

    }
