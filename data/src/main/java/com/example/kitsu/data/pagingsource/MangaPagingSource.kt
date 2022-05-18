package com.example.kitsu.data.pagingsource

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.kitsu.data.remote.apiservices.MangaApiService
import com.example.kitsu.data.remote.dtos.mangamodels.MangaModelDto
import retrofit2.HttpException
import java.io.IOException


class MangaPagingSource(
    private val mangaApiService: MangaApiService,
    private val sort: String
) : PagingSource<Int, MangaModelDto>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MangaModelDto> {
        val page = params.key ?: 1
        return try {
            val response = mangaApiService.fetchManga(sort, params.loadSize, page)
            val nextPage = if (response.links.next == null) {
                null
            } else
                Uri.parse(response.links.next).getQueryParameter("page[offset]")!!.toInt()
            LoadResult.Page(
                data = response.data,
                prevKey = null, nextKey = nextPage
            )

        } catch (io: IOException) {
            LoadResult.Error(io)
        } catch (http: HttpException) {
            LoadResult.Error(http)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, MangaModelDto>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }

    }
}







