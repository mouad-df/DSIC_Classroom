package com.example.estm_project.data.room.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.estm_project.data.room.models.Student
import kotlinx.coroutines.flow.Flow

@Dao
interface Student_Dao{
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(student: Student)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateUser(student: Student)

    @Delete
    suspend fun deleteUser(student: Student)

    @Query("SELECT * FROM student_table")
    fun readAllData(): Flow<List<Student>>

    @Query("SELECT * FROM STUDENT_TABLE WHERE id =:studentId ")
    fun getUser(studentId:Int):Flow<Student>

}