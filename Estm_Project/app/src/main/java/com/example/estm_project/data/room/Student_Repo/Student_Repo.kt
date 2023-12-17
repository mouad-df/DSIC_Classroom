package com.example.estm_project.data.room.Student_Repo

import androidx.lifecycle.LiveData
import com.example.estm_project.data.room.daos.Student_Dao
import com.example.estm_project.data.room.models.Student
import kotlinx.coroutines.flow.Flow

class Student_Repo(val studentDao: Student_Dao) {

    val readAllData : Flow<List<Student>> = studentDao.readAllData()

    suspend fun addStudent(student: Student){
        studentDao.addUser(student)
    }
}