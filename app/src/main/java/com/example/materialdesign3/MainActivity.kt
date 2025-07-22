package com.example.materialdesign3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import com.example.materialdesign3.ui.theme.MaterialDesign3Theme
import com.example.materialdesign3.ui.theme.SimpleScreen // ✅ Make sure this import is correct

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialDesign3Theme {
                // Directly call your UI screen
                SimpleScreen()
            }
        }
    }
}
