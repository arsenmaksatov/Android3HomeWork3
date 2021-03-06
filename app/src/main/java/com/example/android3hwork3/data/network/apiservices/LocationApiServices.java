package com.example.android3hwork3.data.network.apiservices;

import com.example.android3hwork3.model.LocationModel;
import com.example.android3hwork3.model.RickyAndMortyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LocationApiServices {

    @GET("api/location")
    Call<RickyAndMortyResponse<LocationModel>> fetchLocationModel(
           @Query("page") int page
    );

    @GET("api/location/{id}")
    Call<LocationModel> fetchLocationId(
            @Path("id") int id
    );
}