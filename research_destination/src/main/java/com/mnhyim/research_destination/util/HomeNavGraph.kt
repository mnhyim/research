package com.mnhyim.research_destination.util

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph
@NavGraph
annotation class HomeNavGraph(
    val start: Boolean = false
)

