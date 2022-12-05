package com.mnhyim.research_destination.feature.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.mnhyim.research_destination.feature.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.dependency

@RootNavGraph
@Destination
@Composable
fun AuthScreen() {

    DestinationsNavHost(
        navGraph = NavGraphs.auth,
    )
}
