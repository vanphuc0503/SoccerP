package com.vanphuc.sockerp.data.repository.player

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Match
import com.vanphuc.sockerp.data.model.Player
import com.vanphuc.sockerp.ui.common.BaseResponse
import retrofit2.http.Query

interface PlayerRepository {
    suspend fun getPlayers(
        playerId: Int,
        playerName: String? = null
    ): GenericResponse<BaseResponse<List<Player>>>
}