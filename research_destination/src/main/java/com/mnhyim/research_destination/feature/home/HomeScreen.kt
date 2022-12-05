package com.mnhyim.research_destination.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.mnhyim.research_destination.components.AppBottomBar
import com.mnhyim.research_destination.feature.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.dependency

@RootNavGraph
@Destination
@Composable
fun HomeScreen() {
    val scaffoldState = rememberScaffoldState()

    Box {
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopAppBar {
                    Text(text = "TopBar")
                }
            },
            bottomBar = {
            },
            modifier = Modifier.fillMaxSize()
        ) { scaffoldPadding ->
            DestinationsNavHost(
                navGraph = NavGraphs.home,
                dependenciesContainerBuilder = {
                    dependency(scaffoldPadding)
                    dependency(scaffoldState)
                }
            )
        }
    }
}

@Composable
private fun checkCurrentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}
