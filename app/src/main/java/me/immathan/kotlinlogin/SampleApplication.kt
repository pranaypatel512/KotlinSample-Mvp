package me.immathan.kotlinlogin

import android.app.Application
import me.immathan.kotlinlogin.data.AppDataManager
import me.immathan.kotlinlogin.data.DataManager
import me.immathan.kotlinlogin.data.network.ApiHelper
import me.immathan.kotlinlogin.data.network.AppApiHelper
import me.immathan.kotlinlogin.data.network.RestAdapter
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by Mathan-GG on 02-Sep-17.
 */
class SampleApplication : Application() {

    private lateinit var mDataManager: DataManager
    private lateinit var mApiHelper: ApiHelper
    private lateinit var mRestAdapter: RestAdapter

    override fun onCreate() {
        super.onCreate()
        val calligraphyConfig = CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Quicksand-Regular.ttf")
                .build()
        CalligraphyConfig.initDefault(calligraphyConfig)
        mApiHelper = AppApiHelper()
        mDataManager = AppDataManager(mApiHelper)
    }

}