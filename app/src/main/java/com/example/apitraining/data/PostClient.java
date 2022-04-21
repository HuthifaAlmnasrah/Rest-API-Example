package com.example.apitraining.data;

import com.example.apitraining.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostClient {
    private static final String BASE_URL = "http://jsonplaceholder.typicode.com/";
    private ApiInterface apiInterface;
    private static PostClient INSTANSE;

    public PostClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    public static PostClient getINSTANSE() {
        if(INSTANSE == null)
            INSTANSE = new PostClient();
        return INSTANSE;
    }

    public Call<List<PostModel>> getPosts(){
        return apiInterface.getPost();
    }
}
