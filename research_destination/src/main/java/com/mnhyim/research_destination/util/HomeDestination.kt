package com.mnhyim.research_destination.util

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Leaderboard
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.mnhyim.research_destination.R
import com.mnhyim.research_destination.feature.destinations.HomeScreenDestination
import com.mnhyim.research_destination.feature.destinations.MainScreenDestination
import com.mnhyim.research_destination.feature.destinations.ShopScreenDestination
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec

enum class HomeDestination(
    val direction: DirectionDestinationSpec,
    val icon: ImageVector,
    @StringRes val label: Int
) {
    Home(MainScreenDestination, Icons.Outlined.Home, R.string.home_text),
    Shop(ShopScreenDestination, Icons.Outlined.ShoppingCart, R.string.shop_text),
}