package com.example.kitsu.data.remote.network

import com.example.kitsu.data.remote.apiservices.AnimeApiService
import com.example.kitsu.data.remote.apiservices.AuthenticationApiService
import com.example.kitsu.data.remote.apiservices.GenresApiService
import com.example.kitsu.data.remote.apiservices.MangaApiService
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitClient @Inject constructor(
    networkFastBuilder: NetworkFastBuilder,
    okHttp: OkHttp
) {

    private val retrofit = networkFastBuilder.provideRetrofit(okHttp.provideOkHttpClient())
    fun provideAnimeApiService(): AnimeApiService = retrofit.createAnApi()
    fun provideMangaApiService(): MangaApiService = retrofit.createAnApi()
    fun provideGenresApiService(): GenresApiService = retrofit.createAnApi()


    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideAuthenticationApiService(): AuthenticationApiService = retrofit.createAnApi()
    }
}

inline fun <reified T : Any> Retrofit.createAnApi(): T {
    return create(T::class.java)
}