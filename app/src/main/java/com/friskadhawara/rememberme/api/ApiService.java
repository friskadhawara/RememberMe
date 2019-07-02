package com.friskadhawara.rememberme.api;

import com.friskadhawara.rememberme.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public abstract class ApiService {

    @GET("bantul%20yogyakarta.json")
    public abstract Call<ModelJadwal> getJadwal();
}
