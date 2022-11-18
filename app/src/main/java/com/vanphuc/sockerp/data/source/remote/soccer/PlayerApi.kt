package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Player
import retrofit2.http.GET
import retrofit2.http.Query

interface PlayerApi {

    @GET("?action=get_players")
    suspend fun getPlayers(
        @Query("player_id") playerId: Int,
        @Query("player_name") playerName: String? = null
    ): GenericResponse<List<Player>>
}