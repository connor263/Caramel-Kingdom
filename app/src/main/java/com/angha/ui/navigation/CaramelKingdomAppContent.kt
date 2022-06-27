package com.angha.ui.navigation

import android.content.pm.ActivityInfo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.angha.MainActivity
import com.angha.ui.game.menu.MenuScreen
import com.angha.ui.game.menu.MenuViewModel
import com.angha.ui.game.score.ScoreScreen
import com.angha.ui.game.score.ScoreViewModel
import com.angha.ui.game.slot.SlotScreen
import com.angha.ui.game.slot.SlotViewModel

@Composable
fun CaramelKingdomAppContent(navController: NavHostController = rememberNavController()) {
    val activity = LocalContext.current as MainActivity

    NavHost(
        navController = navController,
        startDestination = CaramelKingdomNavKeys.Menu.route
    ) {
        composable(CaramelKingdomNavKeys.Menu.route) {
            val menuViewModel: MenuViewModel = hiltViewModel()
            MenuScreen(navController, menuViewModel)
        }
        composable(CaramelKingdomNavKeys.Slot.route) {
            val slotViewModel: SlotViewModel = hiltViewModel()
            SlotScreen(navController, slotViewModel)
        }
        composable(CaramelKingdomNavKeys.Score.route) {
            val scoreViewModel: ScoreViewModel = hiltViewModel()
            ScoreScreen(navController, scoreViewModel)
        }
    }

    DisposableEffect(Unit) {
        val originalOrientation = activity.requestedOrientation
        activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        onDispose {
            activity.requestedOrientation = originalOrientation
        }
    }
}

sealed class CaramelKingdomNavKeys(val route: String) {
    object Menu : CaramelKingdomNavKeys("menu_screen")
    object Slot : CaramelKingdomNavKeys("slot_screen")
    object Score : CaramelKingdomNavKeys("score_screen")
}