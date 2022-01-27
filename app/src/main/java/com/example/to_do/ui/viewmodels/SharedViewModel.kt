package com.example.to_do.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.to_do.data.models.TodoTask
import com.example.to_do.data.repository.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: TodoRepository
) : ViewModel() {

    private val _allTasks = MutableStateFlow<List<TodoTask>>(emptyList())
    val allTask : StateFlow<List<TodoTask>> = _allTasks

    fun getAllTasks() {
        viewModelScope.launch {
            repository.getAllTask.collect {

            }
        }
    }
}