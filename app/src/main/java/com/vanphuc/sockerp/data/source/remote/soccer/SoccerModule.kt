package com.vanphuc.sockerp.data.source.remote.soccer

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object SoccerModule {

    @Provides
    @Singleton
    fun provideRetrofit(
        // Potential dependencies of this type
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://apiv2.apifootball.com/")
            .build()
    }

    @Provides
    @Singleton
    fun provideCompetitionApi(retrofit: Retrofit): CompetitionApi = retrofit.create(CompetitionApi::class.java)

    @Provides
    @Singleton
    fun provideCountryApi(retrofit: Retrofit): CountryApi = retrofit.create(CountryApi::class.java)

    @Provides
    @Singleton
    fun provideEventApi(retrofit: Retrofit): EventApi = retrofit.create(EventApi::class.java)

    @Provides
    @Singleton
    fun provideH2HApi(retrofit: Retrofit): H2HApi = retrofit.create(H2HApi::class.java)

    @Provides
    @Singleton
    fun provideLineupApi(retrofit: Retrofit): LineupApi = retrofit.create(LineupApi::class.java)

    @Provides
    @Singleton
    fun providePlayerApi(retrofit: Retrofit): PlayerApi = retrofit.create(PlayerApi::class.java)

    @Provides
    @Singleton
    fun providePredictionApi(retrofit: Retrofit): PredictionApi = retrofit.create(PredictionApi::class.java)

    @Provides
    @Singleton
    fun provideStandingApi(retrofit: Retrofit): StandingApi = retrofit.create(StandingApi::class.java)

    @Provides
    @Singleton
    fun provideStatisticApi(retrofit: Retrofit): StatisticApi = retrofit.create(StatisticApi::class.java)

    @Provides
    @Singleton
    fun provideTeamApi(retrofit: Retrofit): TeamApi = retrofit.create(TeamApi::class.java)

    @Provides
    @Singleton
    fun provideTopScoreApi(retrofit: Retrofit): TopScoreApi = retrofit.create(TopScoreApi::class.java)
}