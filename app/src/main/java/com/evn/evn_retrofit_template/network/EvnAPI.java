package com.evn.evn_retrofit_template.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EvnAPI {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static EvnService getEvnService() {
        return retrofit.create(EvnService.class);
    }
}
