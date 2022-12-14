package com.vanphuc.sockerp.ui.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vanphuc.sockerp.ui.SingleLiveData
import kotlinx.coroutines.*

abstract class BaseViewModel : ViewModel() {

    // loading flag
    val isLoading = SingleLiveData(false)

    // error message
    val errorMessage = SingleLiveData("")

    // exception handler for coroutine
    private val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        viewModelScope.launch {
            onLoadFail(throwable)
        }
    }

    /**
     * handle throwable when load fail
     */
    open suspend fun onLoadFail(throwable: Throwable) {
        throwable.printStackTrace()
        withContext(Dispatchers.Main) {
            throwable.message?.let {
                errorMessage.value = it
            }
        }
    }

    // viewModelScope with exception handler
    protected val viewModelScopeExceptionHandler = viewModelScope + exceptionHandler

    /**
     * @param needBlock need loading flag
     * @param action the suspend action
     * @param callback result of #block, is a CoroutinesScope
     * */
    fun <T> executeTask(
        needBlock: Boolean = true,
        action: suspend () -> T,
        callback: CoroutineScope.(T) -> Unit = {}
    ) {
        viewModelScopeExceptionHandler.launch {
            if (needBlock) {
                isLoading.postValue(true)
            }
            withContext(Dispatchers.IO) {
                val value = action()
                callback(value)
            }
            if (needBlock) isLoading.postValue(false)
        }
    }

    fun <T : Any> networkExecuteTask(
        needBlock: Boolean = true,
        action: suspend () -> T,
        callback: (T) -> Unit = {}
    ) {
        executeTask(
            needBlock = needBlock,
            action = action
        ) { result ->
            try {
                (result as? T)?.let {
                    callback(it)
                }
            } catch (ex: Exception) {
                errorMessage.postValue(ex.toString())
            }
        }
    }
}