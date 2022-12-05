package com.mnhyim.research_destination.feature.auth.subscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.mnhyim.research_destination.feature.destinations.HomeScreenDestination
import com.mnhyim.research_destination.feature.destinations.LoginScreenDestination
import com.mnhyim.research_destination.util.AuthNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@AuthNavGraph
@Destination
@Composable
fun RegisterScreen(
    navigator: DestinationsNavigator
) {
    Column {
        Button(onClick = {
            navigator.navigate(LoginScreenDestination)
        }) {
            Text(text = "REGISTER")
        }
        Button(onClick = {
            navigator.navigate(HomeScreenDestination)
        }) {
            Text(text = "HOME")
        }
    }
}