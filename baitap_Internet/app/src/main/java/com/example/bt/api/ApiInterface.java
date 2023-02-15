package com.example.bt.api;

import com.example.bt.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("users.json")
    Call<List<User>> getUser();
}
