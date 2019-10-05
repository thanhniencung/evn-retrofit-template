package com.evn.evn_retrofit_template.network;

import com.evn.evn_retrofit_template.model.News;
import com.evn.evn_retrofit_template.model.Repo;
import com.evn.evn_retrofit_template.model.RssItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EvnService {
    @GET("tin-moi-nhat.rss")
    Call<News> listRepos();
}
