package com.example.registrationapp.data.local.sharedpreferences.userdata

import android.content.SharedPreferences
import com.example.registrationapp.data.local.sharedpreferences.PreferencesHelper

class UserPreferencesData(
    private val preferences: PreferencesHelper
) {

    var isAuthorized: Boolean
        get() = preferences().getBoolean(
            "is_authorized", false
        )
        set(value) = preferences().edit().putBoolean(
            "is_authorized", value
        ).apply()
}