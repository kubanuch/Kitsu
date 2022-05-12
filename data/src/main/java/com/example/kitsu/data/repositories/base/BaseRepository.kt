package com.example.kitsu.data.repositories.base

import android.util.Log
import com.example.kitsu.domain.either.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {

    protected fun <T> doRequest(
        doSomethingSuccess: ((T) -> Unit)? = null,
        request: suspend () -> T
    ) = flow<Either<String, T>> {
        request().also { data ->
            doSomethingSuccess?.invoke(data)
            emit(Either.Right(value = data))
        }
    }.flowOn(Dispatchers.IO).catch { exception ->
        Log.e("BaseRepository", this@BaseRepository.javaClass.name, exception)
        emit(Either.Left(value = exception.localizedMessage ?: "Error Occurred"))
    }
}