package com.mnhyim.research_destination.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.mnhyim.research_destination.feature.NavGraphs
import com.mnhyim.research_destination.feature.appCurrentDestinationAsState
import com.mnhyim.research_destination.feature.destinations.Destination
import com.mnhyim.research_destination.feature.startAppDestination
import com.mnhyim.research_destination.util.HomeDestination
import com.ramcosta.composedestinations.navigation.navigate


@Composable
fun AppBottomBar(
    navController: NavController
) {
    val currentDestination: Destination = navController.appCurrentDestinationAsState().value
        ?: NavGraphs.home.startAppDestination

    BottomNavigation(
        contentColor = MaterialTheme.colors.primary,
        backgroundColor = MaterialTheme.colors.onPrimary
    ) {
        HomeDestination.values().forEach { destination ->
            BottomNavigationItem(
                selected = currentDestination == destination.direction,
                onClick = {
                    navController.navigate(destination.direction) {
                        launchSingleTop = true
                    }
                },
                icon = { Icon(destination.icon, contentDescription = stringResource(destination.label)) },
                label = { Text(stringResource(destination.label)) },
                alwaysShowLabel = false
            )
        }
    }
}