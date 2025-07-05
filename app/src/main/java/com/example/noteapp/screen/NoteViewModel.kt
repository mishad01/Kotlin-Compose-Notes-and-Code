package com.example.noteapp.screen

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.noteapp.model.Note
import com.example.noteapp.data.NotesDataSource
import com.example.noteapp.repository.NoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

class NoteViewModel@Inject constructor(private val repository: NoteRepository) : ViewModel() {
    //private var noteList = mutableStateListOf<Note>()
    private val _noteList = MutableStateFlow<List<Note>>(emptyList())
    val noteList = _noteList.asStateFlow()

    init {
        viewModelScope.launch (Dispatchers.IO){
            repository.getAllNotes().distinctUntilChanged().collect{
                listOfNotes ->
                if(listOfNotes.isEmpty()){
                    Log.d("Empty","Empty List")
                    _noteList.value = emptyList()
                }else{
                    _noteList.value = listOfNotes
                }
            }
        }
    }

      fun addNote(note: Note) = viewModelScope.launch { repository.addNote(note)}
     fun updateNote(note: Note) = viewModelScope.launch { repository.updateNote(note)}
     fun removeNote(note: Note) = viewModelScope.launch { repository.deleteNote(note)}
     fun deleteAllNotes() = viewModelScope.launch { repository.deleteAllNotes()}

    /*init {
        noteList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note){
        noteList.add(note)
    }
    fun removeNote(note: Note){
        noteList.remove(note)

    }

    fun getAllNotes() : List<Note>{
        return noteList
    }*/
}