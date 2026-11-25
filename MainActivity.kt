package com.alameer.tailoring

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.alameer.tailoring.ui.navigation.BottomNavItems
import com.alameer.tailoring.ui.navigation.Screen
import com.alameer.tailoring.ui.screens.*
import com.alameer.tailoring.ui.theme.AlAmeerTheme
import com.alameer.tailoring.ui.theme.Slate900
import com.alameer.tailoring.ui.theme.Teal700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val app = application as AlAmeerApp
        val repository = app.repository

        setContent {
            AlAmeerTheme {
                MainAppScreen(repository = repository)
            }
        }
    }
}