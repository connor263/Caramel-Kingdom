package com.angha.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.angha.data.dao.ScofindViewByIdTextViewRidtvappnameo
import com.angha.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(version = 1, entities = [ScorefindViewByIdTextViewRidtvappnamedel::class])
abstract class CaramfindViewByIdTextViewRidtvappnameomDatabase : RoomDatabase() {
    abstract fun getSfindViewByIdTextViewRidtvappnameeDao(): ScofindViewByIdTextViewRidtvappnameo

    class CallfindViewByIdTextViewRidtvappnamek @Inject constructor(
        private val database: Provider<CaramfindViewByIdTextViewRidtvappnameomDatabase>
    ) : RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            CoroutineScope(SupervisorJob()).launch {
                database.get().getSfindViewByIdTextViewRidtvappnameeDao().inserfindViewByIdTextViewRidtvappnamere(ScorefindViewByIdTextViewRidtvappnamedel(1, 10000))
            }
        }
    }
}