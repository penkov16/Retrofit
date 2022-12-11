package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import ru.netology.nmedia.dto.Post

interface PostRepository {

    fun getAllAsync(callback: GetAllCallback)

    interface GetAllCallback {
        fun onSuccess(posts: List<Post>) {}
        fun onError(e: Exception) {}
    }
    fun save(callback: SaveCallback, post: Post)

    interface SaveCallback {
        fun onSuccess(post: Post) {}
        fun onError(e: Exception) {}
    }
    fun removeById(callback: RemoveByIdCallback, id: Long)

    interface RemoveByIdCallback {
        fun onSuccess(id: Long) {}
        fun onError(e: Exception) {}
    }
    fun likeByIdAdd(callback: LikeByIdAddCallback, id: Long)

    interface LikeByIdAddCallback {
        fun onSuccess(id: Long) {}
        fun onError(e: Exception) {}
    }
    fun likeByIdRemove(callback: LikeByIdRemoveCallback, id: Long)

    interface LikeByIdRemoveCallback {
        fun onSuccess(id: Long) {}
        fun onError(e: Exception) {}
    }
}
