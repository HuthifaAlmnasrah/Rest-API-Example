package com.example.apitraining.data;

import com.example.apitraining.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("posts")
    public Call<List<PostModel>> getPost();
}
