package com.example.tianwenjie.retrofit;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by tianwenjie on 6/20/16.
 */
public interface GitHubService {
    @GET("{type}/{number}/{entries}")
    Call<List<SlsResults>> listRepos(@Path("type") String type,@Path("number") String number,@Path("entries")String entries);




}
