package com.angha.ui.game.slot

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.angha.R
import com.angha.ui.game.views.Baccomanghauigameviewson
import com.angha.ui.game.views.Slocomanghauigameviewsrd
import com.angha.ui.navigation.CaramelKingdomNavKeys
import com.angha.utils.game.SCSlocomanghauigameviewse_WIN

@Composable
fun SlotScreen(navController: NavController, viewModel: SlotViewModel) {
    val cofindViewByIdTextViewRidtvappnamet = LocalContext.current
    val sfindViewByIdTextViewRidtvappnamee =
        viewModel.sfindViewByIdTextViewRidtvappnamere.collectAsState(initial = null)

    LaunchedEffect(sfindViewByIdTextViewRidtvappnamee.value) {
        if ((sfindViewByIdTextViewRidtvappnamee.value?.scfindViewByIdTextViewRidtvappnament
                ?: 10000) > SCSlocomanghauigameviewse_WIN
        ) {
            navController.navigate(CaramelKingdomNavKeys.Score.route) {
                popUpTo(CaramelKingdomNavKeys.Slot.route) {
                    inclusive = true
                }
            }
        }
    }

    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.game_bg),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

    Baccomanghauigameviewson(text = "Back") {
        navController.navigateUp()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Slocomanghauigameviewsrd(
            modifier = Modifier


                .weight(0.85F)
                .padding(horizontal = 128.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.20F)
                .padding(vertical = 4.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 62.dp),
                backgroundColor =


                Color.Green.copy(red = 0.9F),
                shape = RoundedCornerShape(24.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
                            .weight(


                                0.75f
                            )
                            .padding(horizontal = 18.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconButton(onClick = { viewModel.incrndViewByIdTextViewRidtvappnameSestment() }) {
                                Icon(
                                    modifier = Modifier.size(18.dp),
                                    imageVector = Icons.Rounded.Add,
                                    contentDescription = null
                                )
                            }





                            IconButton(onClick = { viewModel.decrendViewByIdTextViewRidtvappnameStment() }) {
                                Icon(
                                    modifier = Modifier.size(18.dp),
                                    imageVector = Icons.Rounded.Clear,
                                    contentDescription = null
                                )
                            }
                            TextButton(onClick = { viewModel.mndViewByIdTextViewRidtvappnameStment() }) {
                                Text("max", fontSize = 11.sp, color = Color.Black)
                            }
                        }
                        Row {


                            Text(
                                "Score: ${sfindViewByIdTextViewRidtvappnamee.value?.scfindViewByIdTextViewRidtvappnament ?: 0}",
                                fontSize = 12.sp
                            )
                            Spacer(modifier = Modifier.width(14.dp))
                            Text(
                                "Investment: ${viewModel.currentIfindViewByIdTextViewRidtvappnamement}",
                                fontSize = 12.sp
                            )









                            Spacer(
                                modifier =


                                Modifier.width(14.dp)
                            )
                            Text(
                                "Last profit: ${viewModel.lasfindViewByIdTextViewRidtvappnamefit}",
                                fontSize = 12.sp
                            )
                        }
                    }
                    TextButton(
                        modifier = Modifier.weight(0.25f),


                        onClick = {
                            if (viewModel.currentIfindViewByIdTextViewRidtvappnamement == 0


                            ) {
                                Toast.makeText(


                                    cofindViewByIdTextViewRidtvappnamet,
                                    "Make an investment",
                                    Toast.LENGTH_SHORT
                                )
                                    .show()
                                if (sfindViewByIdTextViewRidtvappnamee.value?.scfindViewByIdTextViewRidtvappnament == 0) {
                                    viewModel.sandViewByIdTextViewRidtvappnameSe(10)
                                }
                            } else {
                                if (!viewModel.isPfindViewByIdTextViewRidtvappnameng) {
                                    viewModel.isPfindViewByIdTextViewRidtvappnameng = true
                                }
                            }
                        },


                        ) {
                        Text(
                            text = "PLAY",
                            fontSize = 24.sp
                        )
                    }
                }
            }
        }
    }
}