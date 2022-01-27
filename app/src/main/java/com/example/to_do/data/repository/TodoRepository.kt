package com.example.to_do.data.repository

import com.example.to_do.data.TodoDao
import com.example.to_do.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val todoDao: TodoDao) {

    val getAllTask: Flow<List<TodoTask>> = todoDao.getAllTask()
    val sortByLowPriority: Flow<List<TodoTask>> = todoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<TodoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<TodoTask> {
        return todoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(todoTask: TodoTask) {
        return todoDao.addTask(todoTask = todoTask)
    }

    suspend fun updateTask(todoTask: TodoTask) {
        return todoDao.updateTask(todoTask = todoTask)
    }

    suspend fun deleteTask(todoTask: TodoTask) {
        return todoDao.deleteTask(todoTask = todoTask)
    }

    suspend fun deleteAllTask() {
        return todoDao.deleteAllTask()
    }

    fun searchDatabase(searchQuery: String): Flow<List<TodoTask>> {
        return todoDao.searchDatabase(searchQuery = searchQuery)
    }
}