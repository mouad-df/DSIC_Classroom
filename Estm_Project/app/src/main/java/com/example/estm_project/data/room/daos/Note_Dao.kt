package com.example.estm_project.data.room.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.estm_project.data.room.models.Note
import com.example.estm_project.data.room.models.Student
import kotlinx.coroutines.flow.Flow
@Dao
interface Note_Dao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note_table")
    fun getAllNotes(): Flow<List<Note>>

    @Query("SELECT * FROM STUDENT_TABLE WHERE id =:noteId ")
    fun getNote(noteId:Int): Flow<Note>
}