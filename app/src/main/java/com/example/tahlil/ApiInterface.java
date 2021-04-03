package com.example.tahlil;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
      @GET("api/tahlil")
    Call<ObjekBesar>ambilData();
}
