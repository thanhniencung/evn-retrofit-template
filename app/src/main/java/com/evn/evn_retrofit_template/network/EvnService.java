package com.evn.evn_retrofit_template.network;

import com.evn.evn_retrofit_template.model.News;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EvnService {
    @GET("tin-moi-nhat.rss")
    Call<News> listRepos();
}
