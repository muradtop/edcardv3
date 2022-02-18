package com.example.edcardv3;

import android.app.Application;

import com.example.edcardv3.network.PixbayApi;
import com.example.edcardv3.network.RetrofitClient;


public class App extends Application {
    public static RetrofitClient retrofitClient;
    public static PixbayApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofitClient = new RetrofitClient();
        api = retrofitClient.providePixabayApi();
    }
}
