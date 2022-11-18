package com.vanphuc.sockerp.di

import com.vanphuc.sockerp.data.repository.country.CountryRepository
import com.vanphuc.sockerp.data.repository.country.CountryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideCountryRepository(countryRepositoryImpl: CountryRepositoryImpl): CountryRepository
}