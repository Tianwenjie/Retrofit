package com.example.tianwenjie.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io/api/data/")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<List<SlsResults>> repos = service.listRepos("Android","10","1");
        try {
            Response<List<SlsResults>> da = repos.execute();
            Log.i("img","da="+da);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
