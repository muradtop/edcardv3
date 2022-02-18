package com.example.edcardv3.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.edcardv3.App;
import com.example.edcardv3.network.model.Hits;
import com.example.edcardv3.network.model.PixabayResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class PixaBayRepository {


    static PixaBayRepository pizaBayRepository;
    public MutableLiveData<List<Hits>> listImages = new MutableLiveData<>();

    public static PixaBayRepository getInstance() {
        if (pizaBayRepository == null) {
            return new PixaBayRepository();
        }
        return pizaBayRepository;
    }

    public void getImages(String word) {
        App.api.getImages(word).enqueue(new Callback<PixabayResponse>() {
            @Override
            public void onResponse(Call<PixabayResponse> call, Response<PixabayResponse> response) {
                if (response.isSuccessful()) {
                    listImages.postValue(response.body().getHits());
                }

            }

            @Override
            public void onFailure(Call<PixabayResponse> call, Throwable t) {
                Log.e("ololo", t.getMessage());

            }
        });
    }
}
