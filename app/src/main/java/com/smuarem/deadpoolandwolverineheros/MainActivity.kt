package com.smuarem.deadpoolandwolverineheros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.smuarem.deadpoolandwolverineheros.ui.theme.AppTheme
import com.smuarem.deadpoolandwolverineheros.view.screens.HeroApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HeroApp(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
