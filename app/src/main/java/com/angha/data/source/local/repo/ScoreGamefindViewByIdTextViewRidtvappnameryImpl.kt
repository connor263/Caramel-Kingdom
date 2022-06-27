package com.angha.data.source.local.repo

import com.angha.data.dao.ScofindViewByIdTextViewRidtvappnameo
import com.angha.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel
import com.angha.interfaces.ScorefindViewByIdTextViewRidtvappnameitory
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ScoreGamefindViewByIdTextViewRidtvappnameryImpl @Inject constructor(private val scofindViewByIdTextViewRidtvappnameo: ScofindViewByIdTextViewRidtvappnameo) :
    ScorefindViewByIdTextViewRidtvappnameitory {
    override fun gefindViewByIdTextViewRidtvappnamere(): Flow<ScorefindViewByIdTextViewRidtvappnamedel?> {
        return scofindViewByIdTextViewRidtvappnameo.getfindViewByIdTextViewRidtvappnamee()
    }

    override suspend fun insefindViewByIdTextViewRidtvappnamere(value: ScorefindViewByIdTextViewRidtvappnamedel) {
        scofindViewByIdTextViewRidtvappnameo.inserfindViewByIdTextViewRidtvappnamere(value)
    }

    override suspend fun clefindViewByIdTextViewRidtvappnamear() {
        scofindViewByIdTextViewRidtvappnameo.cfindViewByIdTextViewRidtvappnamear()
        scofindViewByIdTextViewRidtvappnameo.inserfindViewByIdTextViewRidtvappnamere(ScorefindViewByIdTextViewRidtvappnamedel())
    }

}