package com.example.to_do.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_do.utils.Constant.LIST_ARGUMENT_KEY
import com.example.to_do.utils.Constant.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) { //we use this navbuilder extension function because we cannot directly apply composable on the SetupNavigation navGraphBuilder
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ){

    }
}