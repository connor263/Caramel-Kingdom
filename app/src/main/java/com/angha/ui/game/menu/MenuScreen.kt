package com.angha.ui.game.menu

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.angha.MainActivity
import com.angha.R
import com.angha.ui.game.views.Mecomanghauigameviewsn
import com.angha.ui.navigation.CaramelKingdomNavKeys

@Composable
fun MenuScreen(navController: NavController, viewModel: MenuViewModel) {
    val activifindViewByIdTextViewRidtvappnamey = LocalContext.current as MainActivity
    val scfindViewByIdTextViewRidtvappnamee = viewModel.scfindViewByIdTextViewRidtvappnamedel.collectAsState(initial =null)

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.game_bg4),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
    Row(
        modifier = Modifier
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.background(
                    brush = Brush.radialGradient(
                        listOf(
                            Color.Black.copy(alpha = 0.7F),
                            Color.Transparent
                        )
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Mecomanghauigameviewsn(text = "Start") {
                    navController.navigate(CaramelKingdomNavKeys.Slot.route)
                }
                Mecomanghauigameviewsn(
                    text = "Score: ${scfindViewByIdTextViewRidtvappnamee.value?.scfindViewByIdTextViewRidtvappnament ?: 0}",
                ) {
                    Toast.makeText(
                        activifindViewByIdTextViewRidtvappnamey,
                        "Score: ${scfindViewByIdTextViewRidtvappnamee.value?.scfindViewByIdTextViewRidtvappnament ?: 0}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            Spacer(Modifier.height(10.dp))
            Mecomanghauigameviewsn(text = "Exit") {
                activifindViewByIdTextViewRidtvappnamey.finish()
            }
        }

    }
}