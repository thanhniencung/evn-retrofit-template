package com.evn.evn_retrofit_template;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.evn.evn_retrofit_template.model.News;
import com.evn.evn_retrofit_template.model.Repo;
import com.evn.evn_retrofit_template.model.RssItem;
import com.evn.evn_retrofit_template.network.EvnAPI;
import com.evn.evn_retrofit_template.network.EvnResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EvnAPI.getEvnService().listRepos()
                .enqueue(new EvnResponse<News>() {
                    @Override
                    public void onData(News data) {
                        String a = "";
                    }

                    @Override
                    public void onError(Throwable t) {
                        String a = "";
                    }
                });
    }
}
