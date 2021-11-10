package com.example.to_do.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.to_do.data.models.TodoTask

@Database(entities = [TodoTask::class], version = 1, exportSchema = false)
abstract class TodoDatabase: RoomDatabase() {
    abstract fun toDoDao(): TodoDao
}