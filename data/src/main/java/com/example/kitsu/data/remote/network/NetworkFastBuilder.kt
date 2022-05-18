package com.example.kitsu.data.remote.network

import com.example.data.BuildConfig
import com.example.kitsu.data.preferences.PreferencesHelper
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class NetworkFastBuilder @Inject constructor() {
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.MAIN_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    fun provideAuthenticationRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl("https://kitsu.io/api/oauth/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
}

class OkHttp @Inject constructor() {
    fun provideOkHttpClient(authenticationInterceptor: AuthenticationInterceptor? = null): OkHttpClient {
        val okHttpClient = OkHttpClient()
            .newBuilder()
            .addInterceptor(provideLoggingInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
        authenticationInterceptor?.let { okHttpClient.addInterceptor(authenticationInterceptor) }
        return okHttpClient.build()
    }

    private fun provideLoggingInterceptor() = HttpLoggingInterceptor().setLevel(
        when {
            BuildConfig.DEBUG -> HttpLoggingInterceptor.Level.BODY
            else -> HttpLoggingInterceptor.Level.NONE
        }
    )

    class AuthenticationInterceptor @Inject constructor(
        private val preferencesHelper: PreferencesHelper
    ) : Interceptor {

        override fun intercept(chain: Interceptor.Chain): okhttp3.Response {
            val request = chain
                .request()
                .newBuilder()
                .addHeader("Authorization:Bearer", "${preferencesHelper.accessToken}")
                .build()
            return chain.proceed(request)
        }
    }
}



