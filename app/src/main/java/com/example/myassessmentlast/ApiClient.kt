package com.example.myassessmentlast

object ApiClient {
    var retrofit = retrofit.Builder().baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun<T>buildApiClient(apiInterface: Class<T>): T{
        return retrofit.create(apiInterface)
    }

}