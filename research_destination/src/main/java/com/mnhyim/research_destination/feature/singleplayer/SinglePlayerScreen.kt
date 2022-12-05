package com.mnhyim.research_destination.feature.singleplayer

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import com.mnhyim.research_destination.feature.destinations.AuthScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@RootNavGraph(start = true)
@Destination
@Composable
fun SinglePlayerScreen(
    navigator: DestinationsNavigator
) {
    Button(onClick = { navigator.navigate(AuthScreenDestination) }) {

    }
}