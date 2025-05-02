package com.lexkirik.musicapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lexkirik.musicapp.ui.theme.AccountView
import com.lexkirik.musicapp.ui.theme.BrowseView
import com.lexkirik.musicapp.ui.theme.HomeView
import com.lexkirik.musicapp.ui.theme.LibraryView
import com.lexkirik.musicapp.ui.theme.SubscriptionView

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues){
    NavHost(navController = navController as NavHostController,
        startDestination = Screen.DrawerScreen.Account.dRoute,
        modifier = Modifier.padding(pd)){

        composable(Screen.BottomScreen.Home.bRoute) {
            HomeView()
        }

        composable(Screen.BottomScreen.Library.bRoute) {
            BrowseView()
        }

        composable(Screen.BottomScreen.Browse.bRoute) {
            LibraryView()
        }

        composable(Screen.DrawerScreen.Account.dRoute) {
            AccountView()
        }

        composable(Screen.DrawerScreen.Subscription.dRoute) {
            SubscriptionView()
        }
    }
}