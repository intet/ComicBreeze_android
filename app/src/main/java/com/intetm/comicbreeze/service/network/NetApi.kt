package com.intetm.comicbreeze.service.network

import com.intetm.comicbreeze.service.database.model.Comic
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit



interface NetApi {
    @GET("comics")
    fun getData(): Observable<List<Comic>>

    companion object  Factory {

        fun create(): NetApi {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://intetm.com/mobile/api/comics/")
                    .build()

            return retrofit.create(NetApi::class.java)
        }
    }}