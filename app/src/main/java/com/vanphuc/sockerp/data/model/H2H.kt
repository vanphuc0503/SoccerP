package com.vanphuc.sockerp.data.model

data class H2H(
    val firstTeam_VS_secondTeam: List<FirstTeamVSSecondTeam>,
    val firstTeam_lastResults: List<FirstTeamLastResult>,
    val secondTeam_lastResults: List<SecondTeamLastResult>
)
