package com.evn.evn_retrofit_template.network;

import com.evn.evn_retrofit_template.model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface EvnService {
    @GET("users/thanhniencung/repos")
    Call<List<Repo>> listRepos();
}
