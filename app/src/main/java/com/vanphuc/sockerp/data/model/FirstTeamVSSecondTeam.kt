package com.vanphuc.sockerp.data.model

data class FirstTeamVSSecondTeam(
    val country_id: String,
    val country_logo: String,
    val country_name: String,
    val league_id: String,
    val league_logo: String,
    val league_name: String,
    val match_awayteam_halftime_score: String,
    val match_awayteam_id: String,
    val match_awayteam_name: String,
    val match_awayteam_score: String,
    val match_date: String,
    val match_hometeam_halftime_score: String,
    val match_hometeam_id: String,
    val match_hometeam_name: String,
    val match_hometeam_score: String,
    val match_id: String,
    val match_live: String,
    val match_status: String,
    val match_time: String,
    val team_away_badge: String,
    val team_home_badge: String
)
