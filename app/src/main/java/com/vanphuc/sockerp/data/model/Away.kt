package com.vanphuc.sockerp.data.model

data class Away(
    val coach: List<Coach>,
    val missing_players: List<MissingPlayer>,
    val starting_lineups: List<StartingLineup>,
    val substitutes: List<Substitute>
)
