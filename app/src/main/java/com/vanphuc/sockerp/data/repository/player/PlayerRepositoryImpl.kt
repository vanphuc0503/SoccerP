package com.vanphuc.sockerp.data.repository.player

import com.vanphuc.sockerp.data.GenericResponse
import com.vanphuc.sockerp.data.model.Player
import com.vanphuc.sockerp.data.source.remote.soccer.PlayerApi
import javax.inject.Inject

class PlayerRepositoryImpl @Inject constructor(
    private val playerApi: PlayerApi
) : PlayerRepository {

    override suspend fun getPlayers(
        playerId: Int,
        playerName: String?
    ): GenericResponse<List<Player>> =
        playerApi.getPlayers(
            playerId = playerId,
            playerName = playerName
        )

}