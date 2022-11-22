package com.vanphuc.sockerp.data.repository.player

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Player
import com.vanphuc.sockerp.data.source.remote.soccer.PlayerApi
import com.vanphuc.sockerp.ui.common.BaseResponse
import javax.inject.Inject

class PlayerRepositoryImpl @Inject constructor(
    private val playerApi: PlayerApi
) : PlayerRepository {

    override suspend fun getPlayers(
        playerId: Int,
        playerName: String?
    ): GenericResponse<BaseResponse<List<Player>>> =
        playerApi.getPlayers(
            playerId = playerId,
            playerName = playerName
        )

}