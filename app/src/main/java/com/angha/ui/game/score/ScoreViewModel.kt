package com.angha.ui.game.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.angha.data.source.local.repo.ScoreGamefindViewByIdTextViewRidtvappnameryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScoreViewModel @Inject constructor(private val scoreGamefindViewByIdTextViewRidtvappnameryImpl: ScoreGamefindViewByIdTextViewRidtvappnameryImpl) :
    ViewModel() {
val scfindViewByIdTextViewRidtvappname = scoreGamefindViewByIdTextViewRidtvappnameryImpl.gefindViewByIdTextViewRidtvappnamere()

    fun clefindViewByIdTextViewRidtvappnamere() = viewModelScope.launch(Dispatchers.IO){
        scoreGamefindViewByIdTextViewRidtvappnameryImpl.clefindViewByIdTextViewRidtvappnamear()
    }
}