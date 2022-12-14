package com.vanphuc.sockerp.data.model

data class Predictions(
    val country_id: String,
    val country_name: String,
    val league_id: String,
    val league_name: String,
    val match_awayteam_extra_score: String,
    val match_awayteam_halftime_score: String,
    val match_awayteam_id: String,
    val match_awayteam_name: String,
    val match_awayteam_penalty_score: String,
    val match_awayteam_score: String,
    val match_awayteam_system: String,
    val match_date: String,
    val match_hometeam_extra_score: String,
    val match_hometeam_halftime_score: String,
    val match_hometeam_id: String,
    val match_hometeam_name: String,
    val match_hometeam_penalty_score: String,
    val match_hometeam_score: String,
    val match_hometeam_system: String,
    val match_id: String,
    val match_live: String,
    val match_status: String,
    val match_time: String,
    val prob_AW: String,
    val prob_AW_D: String,
    val prob_D: String,
    val prob_HW: String,
    val prob_HW_AW: String,
    val prob_HW_D: String,
    val prob_O: String,
    val prob_O_1: String,
    val prob_O_3: String,
    val prob_U: String,
    val prob_U_1: String,
    val prob_U_3: String,
    val `prob_ah_a_-05`: String,
    val `prob_ah_a_-15`: String,
    val `prob_ah_a_-25`: String,
    val `prob_ah_a_-35`: String,
    val `prob_ah_a_-45`: String,
    val prob_ah_a_05: String,
    val prob_ah_a_15: String,
    val prob_ah_a_25: String,
    val prob_ah_a_35: String,
    val prob_ah_a_45: String,
    val `prob_ah_h_-05`: String,
    val `prob_ah_h_-15`: String,
    val `prob_ah_h_-25`: String,
    val `prob_ah_h_-35`: String,
    val `prob_ah_h_-45`: String,
    val prob_ah_h_05: String,
    val prob_ah_h_15: String,
    val prob_ah_h_25: String,
    val prob_ah_h_35: String,
    val prob_ah_h_45: String,
    val prob_bts: String,
    val prob_ots: String
)
