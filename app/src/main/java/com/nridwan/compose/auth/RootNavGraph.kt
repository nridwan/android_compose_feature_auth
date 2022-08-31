package com.nridwan.compose.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nridwan.compose.ui.nav.SharedNav
import com.nridwan.compose.ui.placeholder.PlaceholderScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        route = SharedNav.ROOT,
        navController = navController,
        startDestination = SharedNav.AUTH
    ) {
        authGraph(navController)
        SharedNav.allExcept(SharedNav.AUTH).forEach {
            composable(it) { PlaceholderScreen(navController = navController) }
        }
    }
}