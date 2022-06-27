package com.angha.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.angha.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel
import kotlinx.coroutines.flow.Flow

@Dao
interface ScofindViewByIdTextViewRidtvappnameo {

    @Query("SELECT * FROM ${ScorefindViewByIdTextViewRidtvappnamedel.TABLE_NAME}")
    fun getfindViewByIdTextViewRidtvappnamee(): Flow<ScorefindViewByIdTextViewRidtvappnamedel?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserfindViewByIdTextViewRidtvappnamere(scorefindViewByIdTextViewRidtvappnamedel: ScorefindViewByIdTextViewRidtvappnamedel)

    @Query("DELETE FROM ${ScorefindViewByIdTextViewRidtvappnamedel.TABLE_NAME}")
    suspend fun cfindViewByIdTextViewRidtvappnamear()
}