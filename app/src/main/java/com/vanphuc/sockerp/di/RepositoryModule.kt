package com.vanphuc.sockerp.di

import com.vanphuc.sockerp.data.repository.competition.CompetitionRepository
import com.vanphuc.sockerp.data.repository.competition.CompetitionRepositoryImpl
import com.vanphuc.sockerp.data.repository.country.CountryRepository
import com.vanphuc.sockerp.data.repository.country.CountryRepositoryImpl
import com.vanphuc.sockerp.data.repository.event.EventRepository
import com.vanphuc.sockerp.data.repository.event.EventRepositoryImpl
import com.vanphuc.sockerp.data.repository.h2h.H2HRepository
import com.vanphuc.sockerp.data.repository.h2h.H2HRepositoryImpl
import com.vanphuc.sockerp.data.repository.lineup.LineupRepository
import com.vanphuc.sockerp.data.repository.lineup.LineupRepositoryImpl
import com.vanphuc.sockerp.data.repository.player.PlayerRepository
import com.vanphuc.sockerp.data.repository.player.PlayerRepositoryImpl
import com.vanphuc.sockerp.data.repository.prediction.PredictionRepository
import com.vanphuc.sockerp.data.repository.prediction.PredictionRepositoryImpl
import com.vanphuc.sockerp.data.repository.standing.StandingRepository
import com.vanphuc.sockerp.data.repository.standing.StandingRepositoryImpl
import com.vanphuc.sockerp.data.repository.statistic.StatisticRepository
import com.vanphuc.sockerp.data.repository.statistic.StatisticRepositoryImpl
import com.vanphuc.sockerp.data.repository.team.TeamRepository
import com.vanphuc.sockerp.data.repository.team.TeamRepositoryImpl
import com.vanphuc.sockerp.data.repository.topscore.TopScoreRepository
import com.vanphuc.sockerp.data.repository.topscore.TopScoreRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideCountryRepository(countryRepositoryImpl: CountryRepositoryImpl): CountryRepository

    @Binds
    abstract fun provideCompetitionRepository(competitionRepositoryImpl: CompetitionRepositoryImpl): CompetitionRepository

    @Binds
    abstract fun provideEventRepository(eventRepositoryImpl: EventRepositoryImpl): EventRepository

    @Binds
    abstract fun provideH2HRepository(h2HRepositoryImpl: H2HRepositoryImpl): H2HRepository

    @Binds
    abstract fun provideLineupRepository(lineupRepositoryImpl: LineupRepositoryImpl): LineupRepository

    @Binds
    abstract fun providePlayerRepository(playerRepositoryImpl: PlayerRepositoryImpl): PlayerRepository

    @Binds
    abstract fun providePredictionRepository(predictionRepositoryImpl: PredictionRepositoryImpl): PredictionRepository

    @Binds
    abstract fun provideStandingRepository(standingRepositoryImpl: StandingRepositoryImpl): StandingRepository

    @Binds
    abstract fun provideStatisticRepository(statisticRepositoryImpl: StatisticRepositoryImpl): StatisticRepository

    @Binds
    abstract fun provideTeamRepository(teamRepositoryImpl: TeamRepositoryImpl): TeamRepository

    @Binds
    abstract fun provideTopScoreRepository(topScoreRepositoryImpl: TopScoreRepositoryImpl): TopScoreRepository
}