package com.rk.testapp2.repo

import retrofit2.http.GET

interface NetworkApi {

    //https://enigmatic-coast-6264.herokuapp.com/categories
    @GET("/categories")
    fun getCategories()

    @GET("/categories")
    //https://enigmatic-coast-6264.herokuapp.com/categories/10
    fun getProductList()

}