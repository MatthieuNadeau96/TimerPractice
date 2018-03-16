package com.umatthieu.timerpractice

import android.os.Bundle
import android.support.v7.preference.PreferenceFragmentCompat

/**
 * Created by matth on 3/16/2018.
 */
class SettingsActivityFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}