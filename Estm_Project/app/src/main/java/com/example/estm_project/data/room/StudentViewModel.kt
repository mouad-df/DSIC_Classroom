package com.example.estm_project.data.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.estm_project.data.room.Student_Repo.Student_Repo
import com.example.estm_project.data.room.models.Student
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class StudentViewModel(application: Application):AndroidViewModel(application) {

    private  val readAllData: Flow<List<Student>>
    private val repository : Student_Repo

    init {
        val studentDao = ClassDatabase.getDatabase(application).studentDao()
        repository = Student_Repo(studentDao)
        readAllData= repository.readAllData
    }

    fun addStudent(student: Student){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addStudent(student)
        }
    }
}