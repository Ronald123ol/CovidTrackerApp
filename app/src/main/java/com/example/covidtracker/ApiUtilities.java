package com.example.covidtracker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

    public static Retrofit retrofit=null;

    public static ApiInterface getApIInterface()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.Base_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(ApiInterface.class);

    }


}
