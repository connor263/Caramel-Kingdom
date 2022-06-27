package com.angha.ui.game.score

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.angha.R
import com.angha.ui.game.views.Mecomanghauigameviewsn
import com.angha.ui.navigation.CaramelKingdomNavKeys

@Composable
fun ScoreScreen(navController: NavHostController, viewModel: ScoreViewModel) {
    val sfindViewByIdTextViewRidtvappnamere = viewModel.scfindViewByIdTextViewRidtvappname.collectAsState(initial = null)

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.game_bg),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            border = BorderStroke(2.dp, Color.White),
            shape = RoundedCornerShape(16.dp),
            backgroundColor = Color.Green.copy(
                red = 0.3F,
                alpha = 0.9F
            ),
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "You won!",
                    style = MaterialTheme.typography.h5
                )
                Spacer(Modifier.height(8.dp))
                Text(
                    text = "Your score: ${sfindViewByIdTextViewRidtvappnamere.value?.scfindViewByIdTextViewRidtvappnament}",
                    style = MaterialTheme.typography.h5
                )
                Spacer(Modifier.height(12.dp))
                Mecomanghauigameviewsn(text = "Play again?") {
                    viewModel.clefindViewByIdTextViewRidtvappnamere()
                    navController.navigate(CaramelKingdomNavKeys.Slot.route) {
                        popUpTo(CaramelKingdomNavKeys.Score.route) {
                            inclusive = true
                        }
                    }
                }
                Mecomanghauigameviewsn(text = "Menu") {
                    viewModel.clefindViewByIdTextViewRidtvappnamere()
                    navController.navigate(CaramelKingdomNavKeys.Menu.route) {
                        popUpTo(CaramelKingdomNavKeys.Score.route) {
                            inclusive = true
                        }
                    }
                }
            }
        }
    }
}