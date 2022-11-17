package com.vanphuc.sockerp.data.source.remote.soccer

import com.vanphuc.sockerp.data.source.SoccerRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object SoccerModule {

    @Provides
    @Singleton
    fun provideCompetitionApi(@SoccerRetrofit retrofit: Retrofit): CompetitionApi =
        retrofit.create(CompetitionApi::class.java)

    @Provides
    @Singleton
    fun provideCountryApi(@SoccerRetrofit retrofit: Retrofit): CountryApi =
        retrofit.create(CountryApi::class.java)

    @Provides
    @Singleton
    fun provideEventApi(@SoccerRetrofit retrofit: Retrofit): EventApi =
        retrofit.create(EventApi::class.java)

    @Provides
    @Singleton
    fun provideH2HApi(@SoccerRetrofit retrofit: Retrofit): H2HApi =
        retrofit.create(H2HApi::class.java)

    @Provides
    @Singleton
    fun provideLineupApi(@SoccerRetrofit retrofit: Retrofit): LineupApi =
        retrofit.create(LineupApi::class.java)

    @Provides
    @Singleton
    fun providePlayerApi(@SoccerRetrofit retrofit: Retrofit): PlayerApi =
        retrofit.create(PlayerApi::class.java)

    @Provides
    @Singleton
    fun providePredictionApi(@SoccerRetrofit retrofit: Retrofit): PredictionApi =
        retrofit.create(PredictionApi::class.java)

    @Provides
    @Singleton
    fun provideStandingApi(@SoccerRetrofit retrofit: Retrofit): StandingApi =
        retrofit.create(StandingApi::class.java)

    @Provides
    @Singleton
    fun provideStatisticApi(@SoccerRetrofit retrofit: Retrofit): StatisticApi =
        retrofit.create(StatisticApi::class.java)

    @Provides
    @Singleton
    fun provideTeamApi(@SoccerRetrofit retrofit: Retrofit): TeamApi =
        retrofit.create(TeamApi::class.java)

    @Provides
    @Singleton
    fun provideTopScoreApi(@SoccerRetrofit retrofit: Retrofit): TopScoreApi =
        retrofit.create(TopScoreApi::class.java)
}