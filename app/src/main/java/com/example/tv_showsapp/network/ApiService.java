package com.example.tv_showsapp.network;

import com.example.tv_showsapp.responses.TVShowsResponses;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("most-popular")
    Call<TVShowsResponses>  getMostPopularTVShows(@Query("page") int page);
}
