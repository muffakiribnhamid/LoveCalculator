package com.muffakir.lovecalculator

import android.content.Context
import android.preference.PreferenceManager
import java.util.prefs.Preferences

object SharedPrefHelper {
    fun savefirst_name(context : Context , firstname : String) {
        PreferenceManager.getDefaultSharedPreferences(
            context
        ).edit()
            .putString("FIRSTNAME",firstname)
            .apply()
    }
    fun savesecond_name(context : Context , secondname : String) {
        PreferenceManager.getDefaultSharedPreferences(
            context
        ).edit()
            .putString("SECONDNAME",secondname)
            .apply()
    }
    fun get_firstname(context: Context): String?{
        return PreferenceManager.getDefaultSharedPreferences(
            context
        ).getString("FIRSTNAME","")

    }
    fun get_secondname(context: Context): String?{
        return PreferenceManager.getDefaultSharedPreferences(
            context
        ).getString("SECONDNAME","")

    }




}