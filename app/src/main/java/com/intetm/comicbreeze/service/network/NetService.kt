package com.intetm.comicbreeze.service.network

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


const val API_URL:String = ""
class NetService{

    fun loadComic(){
       val api = NetApi.create()
        api.getData().observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    result ->
                    Log.d("Result", "There are ${result.size} Java developers in Lagos")
                }, { error ->
                    error.printStackTrace()
                })
    }
    companion object Factory{
        fun create():NetService = NetService()
    }
}