package com.vanphuc.sockerp.domain

abstract class UseCase<Type, in Params> where Type : Any? {
    protected abstract suspend fun run(params: Params) : Type

    suspend fun invoke(params: Params): Type {
        return run(params)
    }

    class None
}