package com.vanphuc.sockerp.data.model

data class Teams(
    val coaches: List<Coache>,
    val players: List<Player>,
    val team_badge: String,
    val team_key: String,
    val team_name: String
)
