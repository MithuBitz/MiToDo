package com.example.to_do.data

import androidx.room.*
import com.example.to_do.data.models.TodoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {

    //Get all from the table
    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTask(): Flow<List<TodoTask>>

    //Get a single task from the table
    @Query("SELECT * FROM todo_table WHERE id= :taskId")
    fun getSelectedTask(taskId: Int): Flow<TodoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(todoTask: TodoTask) // suspend is used if we dont use Flow

    @Update
    suspend fun updateTask(todoTask: TodoTask)

    @Delete
    suspend fun deleteTask(todoTask: TodoTask)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTask()

    //search table from the database useing the search string
    @Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
    fun searchDatabase(searchQuery: String): Flow<List<TodoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END")
    fun sortByLowPriority(): Flow<List<TodoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END")
    fun sortByHighPriority(): Flow<List<TodoTask>>


}