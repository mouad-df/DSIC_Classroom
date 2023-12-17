package com.example.estm_project.data.room.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name: String,
    var email : String,
    var password:String,
    val noteIdFk:Double

)

