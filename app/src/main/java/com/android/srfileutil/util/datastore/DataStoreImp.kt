package com.android.srfileutil.util.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import com.android.srfileutil.util.datastore.DataStoreImp.PreferencesKeys.LOGGED_IN_MODE_KEY
import com.android.srfileutil.util.datastore.DataStoreImp.PreferencesKeys.NIGHT_MODE_KEY
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

private const val STORE_NAME = "srfileutil_data_store"
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = STORE_NAME)

class DataStoreImp @Inject constructor(
    @ApplicationContext context: Context
) : IDataStore {
    private val dataStore = context.dataStore

    override fun isNightMode() = dataStore.data.catch { exception ->
        if(exception is IOException)
            emit(emptyPreferences())
        else
            throw exception
    }.map { value -> value[NIGHT_MODE_KEY] as Boolean }


    override suspend fun toggleNightMode() {
    }

    override fun isLoggedIn() = dataStore.data.catch { exception ->
        if(exception is IOException)
            emit(emptyPreferences())
        else
            throw exception
    }.map { value -> value[LOGGED_IN_MODE_KEY] as Boolean }

    override suspend fun toggleIsLoggedIn() {
    }

    private object PreferencesKeys {
        val NIGHT_MODE_KEY = booleanPreferencesKey("dark_theme_enabled")
        val LOGGED_IN_MODE_KEY = booleanPreferencesKey("logged_in")
    }
}