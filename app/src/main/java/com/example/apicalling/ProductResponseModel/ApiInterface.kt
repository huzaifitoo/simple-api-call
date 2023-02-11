package com.example.apicalling

import com.example.apicalling.ProductResponseModel.ProductResponseModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("products")
    fun getproducts(): Call<ProductResponseModel>
}