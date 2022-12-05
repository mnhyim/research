package com.mnhyim.research_destination.feature.auth.subscreen

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.mnhyim.research_destination.feature.destinations.RegisterScreenDestination
import com.mnhyim.research_destination.util.AuthNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@AuthNavGraph(start = true)
@Destination
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    Button(onClick = {
        navigator.navigate(RegisterScreenDestination)
    }) {
        Text(text = "LOGIN")
    }
}