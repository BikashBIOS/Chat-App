package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAnBfavDY:APA91bESwn-3FlrQdJFrnd-MhWcVwTX-zdxM-pFLEr6uYWosZgSjTku4HDgcAF_GoQwXNMA9xnVb7IYAzwFNzpkVv-76hPUdMKZNVFdxxroTFmRmIdzJ2PFAS4pt5fyjqJAlr49s9NZH"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
