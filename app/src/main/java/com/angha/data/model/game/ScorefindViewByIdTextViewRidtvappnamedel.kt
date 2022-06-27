package com.angha.data.model.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.angha.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class ScorefindViewByIdTextViewRidtvappnamedel(

    @PrimaryKey
    @ColumnInfo(name = COLUMN_ID)
    val sfindViewByIdTextViewRidtvappnameId: Int = 1,

    @ColumnInfo(name = COLUMN_SCORE)
    val scfindViewByIdTextViewRidtvappnament: Int = 10000
) {
    companion object {
        const val TABLE_NAME = "scoreGameModel"
        const val COLUMN_ID = "scoreId"
        const val COLUMN_SCORE = "scoreInt"
    }
}