package com.mnhyim.research_avatar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mnhyim.research_avatar.screen.AvatarScreen
import com.mnhyim.research_avatar.screen.AvatarScreenNonCanvas
import com.mnhyim.research_avatar.ui.theme.ComposeResearchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeResearchTheme {
                AvatarScreen()
            }
        }
    }
}
