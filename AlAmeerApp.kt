package com.alameer.tailoring

import android.app.Application
import com.alameer.tailoring.data.local.TailoringDatabase
import com.alameer.tailoring.data.repository.TailoringRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

class AlAmeerApp : Application() {
    val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    val database by lazy { TailoringDatabase.getDatabase(this) }
    val repository by lazy { TailoringRepository(database.tailoringDao()) }

    override fun onCreate() {
        super.onCreate()
        applicationScope.launch {
            repository.seedInitialDataIfEmpty()
        }
    }
}