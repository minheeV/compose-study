package com.study.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.study.compose.ui.theme.ComposestudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposestudyTheme {
            }
        }
    }
}

@Composable
fun ComposeStudyApp() {
    val navController = rememberNavController()
    Column {
        Button(onClick = { }) {
            
        }
    }

}

@Preview
@Composable
fun ComposeStudyAppPreview() {
    ComposestudyTheme {
    }
}


