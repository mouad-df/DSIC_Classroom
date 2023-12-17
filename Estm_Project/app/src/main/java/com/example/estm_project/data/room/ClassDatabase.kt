package com.example.estm_project.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.estm_project.data.room.daos.Note_Dao
import com.example.estm_project.data.room.daos.Student_Dao
import com.example.estm_project.data.room.models.Note
import com.example.estm_project.data.room.models.Student

@Database(
    entities = [Student::class, Note::class],
    version = 1, exportSchema = false
)
public abstract class ClassDatabase: RoomDatabase() {
    abstract  fun studentDao():Student_Dao
    abstract fun noteDao():Note_Dao

    companion object{
        @Volatile
        var INSTANCE:ClassDatabase? = null
        fun getDatabase(context:Context):ClassDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ClassDatabase::class.java,
                    "class_db"
                ).fallbackToDestructiveMigration()
                    .build().
                    also { INSTANCE = it }
                INSTANCE = instance
                return instance
            }
        }
    }
}