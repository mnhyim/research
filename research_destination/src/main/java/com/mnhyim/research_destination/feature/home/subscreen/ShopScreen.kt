package com.mnhyim.research_destination.feature.home.subscreen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.mnhyim.research_destination.util.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination

@HomeNavGraph
@Destination
@Composable
fun ShopScreen() {
    Text(text = "Shop")
}