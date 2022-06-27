package com.angha.ui.game.slot

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angha.data.model.game.GamefindViewByIdTextViewRidtvappnameel
import com.angha.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel
import com.angha.data.source.local.repo.ScoreGamefindViewByIdTextViewRidtvappnameryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SlotViewModel @Inject constructor(
    private val scoreGamefindViewByIdTextViewRidtvappnameryImpl: ScoreGamefindViewByIdTextViewRidtvappnameryImpl
) : ViewModel() {
    private val lisfindViewByIdTextViewRidtvappnameots =
        mutableStateMapOf<Int, List<GamefindViewByIdTextViewRidtvappnameel>>()
    var isPfindViewByIdTextViewRidtvappnameng by mutableStateOf(false)

    val sfindViewByIdTextViewRidtvappnamere =
        scoreGamefindViewByIdTextViewRidtvappnameryImpl.gefindViewByIdTextViewRidtvappnamere()

    var currentIfindViewByIdTextViewRidtvappnamement by mutableStateOf(0)

    var lasfindViewByIdTextViewRidtvappnamefit by mutableStateOf(0)

    fun updfindViewByIdTextViewRidtvappnameSlots(
        slotId: Int,
        list: List<GamefindViewByIdTextViewRidtvappnameel>,
        iSSlocomanghauigameviewsewal: Boolean = false
    ) {
        isPfindViewByIdTextViewRidtvappnameng = false
        lisfindViewByIdTextViewRidtvappnameots.remove(slotId)
        lisfindViewByIdTextViewRidtvappnameots[slotId] = list

        if (!iSSlocomanghauigameviewsewal && slotId == 5 && currentIfindViewByIdTextViewRidtvappnamement != 0) {
            var mandViewByIdTextViewRidtvappnameSes = 0
            val ndViewByIdTextViewRidtvappnameSts = lisfindViewByIdTextViewRidtvappnameots.values

            ndViewByIdTextViewRidtvappnameSts.forEach { cundViewByIdTextViewRidtvappnameSList ->
                cundViewByIdTextViewRidtvappnameSList.forEach { curndViewByIdTextViewRidtvappnameSSlot ->
                    ndViewByIdTextViewRidtvappnameSts.forEach List@{ checkList ->
                        checkList.forEach { checndViewByIdTextViewRidtvappnameSt ->
                            if (curndViewByIdTextViewRidtvappnameSSlot.drawafindViewByIdTextViewRidtvappnamees == checndViewByIdTextViewRidtvappnameSt.drawafindViewByIdTextViewRidtvappnamees &&
                                curndViewByIdTextViewRidtvappnameSSlot.dafwlwafldafmdw < checndViewByIdTextViewRidtvappnameSt.dafwlwafldafmdw &&
                                curndViewByIdTextViewRidtvappnameSSlot.idfindViewByIdTextViewRidtvappnameot == checndViewByIdTextViewRidtvappnameSt.idfindViewByIdTextViewRidtvappnameot
                            ) {
                                curndViewByIdTextViewRidtvappnameSSlot.isSSlocomanghauigameviewsew = true
                                checndViewByIdTextViewRidtvappnameSt.isSSlocomanghauigameviewsew = true
                                mandViewByIdTextViewRidtvappnameSes++
                            }
                        }
                    }
                }
            }
            if (mandViewByIdTextViewRidtvappnameSes != 0) sandViewByIdTextViewRidtvappnameSe(
                mandViewByIdTextViewRidtvappnameSes
            )
        }
    }

    fun incrndViewByIdTextViewRidtvappnameSestment() = viewModelScope.launch {
        if (currentIfindViewByIdTextViewRidtvappnamement < (sfindViewByIdTextViewRidtvappnamere.first()?.scfindViewByIdTextViewRidtvappnament
                ?: 0) && !isPfindViewByIdTextViewRidtvappnameng
        ) {
            currentIfindViewByIdTextViewRidtvappnamement += 50
        }
    }

    fun decrendViewByIdTextViewRidtvappnameStment() = viewModelScope.launch {
        if (currentIfindViewByIdTextViewRidtvappnamement != 0 && !isPfindViewByIdTextViewRidtvappnameng) {
            currentIfindViewByIdTextViewRidtvappnamement -= 50
        }
    }

    fun mndViewByIdTextViewRidtvappnameStment() = viewModelScope.launch {
        if (!isPfindViewByIdTextViewRidtvappnameng) {
            currentIfindViewByIdTextViewRidtvappnamement =
                sfindViewByIdTextViewRidtvappnamere.first()?.scfindViewByIdTextViewRidtvappnament
                    ?: 0
        }
    }

    fun sandViewByIdTextViewRidtvappnameSe(matches: Int) = viewModelScope.launch(Dispatchers.IO) {
        val currndViewByIdTextViewRidtvappnameSre =
            (sfindViewByIdTextViewRidtvappnamere.first()?.scfindViewByIdTextViewRidtvappnament ?: 0)
        val nndViewByIdTextViewRidtvappnameSore =
            currndViewByIdTextViewRidtvappnameSre + (currentIfindViewByIdTextViewRidtvappnamement * matches)
        lasfindViewByIdTextViewRidtvappnamefit =
            nndViewByIdTextViewRidtvappnameSore - currndViewByIdTextViewRidtvappnameSre
        scoreGamefindViewByIdTextViewRidtvappnameryImpl.insefindViewByIdTextViewRidtvappnamere(
            ScorefindViewByIdTextViewRidtvappnamedel(1, nndViewByIdTextViewRidtvappnameSore)
        )
    }
}