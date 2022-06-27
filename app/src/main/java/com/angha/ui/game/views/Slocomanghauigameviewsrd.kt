package com.angha.ui.game.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun Slocomanghauigameviewsrd(modifier: Modifier = Modifier) {
    val stecomanghauigameviewsh = (LocalConfiguration.current.screenWidthDp / 2) / 5
    val stecomanghauigameviewsht = LocalConfiguration.current.screenHeightDp / 6

    Card(
        modifier = modifier,
        backgroundColor = Color.Black.copy(alpha = 0.6F),
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .height((stecomanghauigameviewsht * 5).dp)
                    .clipToBounds(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top
            ) {
                repeat(5) {
                    SSlocomanghauigameviewsew(
                        stSlocomanghauigameviewsht = stecomanghauigameviewsht.dp,
                        sSlocomanghauigameviewsdth = stecomanghauigameviewsh.dp,
                        sSlocomanghauigameviewsId = it + 1
                    )
                }
            }
        }
    }
}