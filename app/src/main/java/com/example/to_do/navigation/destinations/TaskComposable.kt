package com.example.to_do.navigation.destinations

import android.drm.DrmStore
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_do.utils.Action
import com.example.to_do.utils.Constant
import com.example.to_do.utils.Constant.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) { //we use this navbuilder extension function because we cannot directly apply composable on the SetupNavigation navGraphBuilder
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(Constant.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ){

    }
}