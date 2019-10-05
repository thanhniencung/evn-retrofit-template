package com.evn.evn_retrofit_template.network;

import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class EvnAPI {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://vnexpress.net/rss/")
            //.addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(SimpleXmlConverterFactory.create())
            //.addConverterFactory(JaxbConverterFactory.create())
            .build();

    public static EvnService getEvnService() {
        return retrofit.create(EvnService.class);
    }
}
