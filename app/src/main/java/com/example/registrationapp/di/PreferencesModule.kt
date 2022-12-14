package com.example.registrationapp.di

import android.content.Context
import com.example.registrationapp.data.local.sharedpreferences.PreferencesHelper
import com.example.registrationapp.data.local.sharedpreferences.userdata.UserPreferencesData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PreferencesModule {

    @Singleton
    @Provides
    fun providePreferencesHelper(@ApplicationContext context: Context) =
        PreferencesHelper(context)

    @Singleton
    @Provides
    fun provideUserPreferencesData(preferencesHelper: PreferencesHelper) =
        UserPreferencesData(preferencesHelper)
}