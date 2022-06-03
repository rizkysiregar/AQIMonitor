package com.c22_ce02.awmonitorapp.di

import com.c22_ce02.awmonitorapp.BuildConfig
import com.c22_ce02.awmonitorapp.api.ApiConfig
import com.c22_ce02.awmonitorapp.data.repository.*

object Injection {

    fun provideCurrentWeatherConditionRepository(): CurrentWeatherConditionRepository {
        val apiService = ApiConfig.getApiService(BuildConfig.BASE_URL_WEATHERBIT)
        return CurrentWeatherConditionRepository(apiService)
    }

    fun provideCurrentAirQualityRepository(): CurrentAirQualityRepository {
        val apiService = ApiConfig.getApiService(BuildConfig.BASE_URL_WEATHERBIT)
        return CurrentAirQualityRepository(apiService)
    }

    fun provideAirQualityForecastByHourRepository(): AirQualityForecastByHourRepository {
        val apiService = ApiConfig.getApiService(BuildConfig.BASE_URL_WEATHERBIT)
        return AirQualityForecastByHourRepository(apiService)
    }

    fun provideWeatherForecastByHourRepository(): WeatherForecastByHourRepository {
        val apiService = ApiConfig.getApiService(BuildConfig.BASE_URL_WEATHERBIT)
        return WeatherForecastByHourRepository(apiService)
    }

    fun providePostCurrentWeatherAndAirDataRepository(): PostCurrentWeatherAndAirDataRepository {
        val apiService = ApiConfig.getApiService(BuildConfig.BASE_URL_AQIMonitor)
        return PostCurrentWeatherAndAirDataRepository(apiService)
    }
}