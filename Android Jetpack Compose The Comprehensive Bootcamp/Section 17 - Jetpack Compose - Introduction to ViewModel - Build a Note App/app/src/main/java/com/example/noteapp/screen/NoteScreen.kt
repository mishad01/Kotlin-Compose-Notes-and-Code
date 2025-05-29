package com.example.noteapp.screen

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.noteapp.R
import com.example.noteapp.components.NoteButton
import com.example.noteapp.components.NoteInputText
import com.example.noteapp.data.Note
import com.example.noteapp.data.NotesDataSource
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit,
) {
    val title = remember { mutableStateOf("") }
    val description = remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(modifier = Modifier.padding(6.dp)) {
        TopAppBar(
            title = { Text(stringResource(id = R.string.app_name)) },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Icon"
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(Color(0xFFDADFE3))
        )

        //Content
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 8.dp),
                text = title.value,
                label = "Hello",
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) title.value = it

                    /*This lambda is called whenever the user types something.
                    it.all { char -> char.isLetter() || char.isWhitespace() } means:
                    Only allow input that consists of letters (A–Z, a–z) and spaces.
                    No numbers, punctuation, or symbols are allowed.
                    If the input matches this condition, it updates title.value.*/
                }
            )
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 8.dp),
                text = description.value,
                label = "Add a note",
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description.value = it
                }
            )

            NoteButton(text = "Save",
                onClick = {
                    if (title.value.isNotEmpty() && description.value.isNotEmpty()) {
                        //Save/add to the list
                        onAddNote(
                            Note(
                                title = title.value,
                                description = description.value
                            )
                        )
                        title.value = ""
                        description.value = ""
                        Toast.makeText(context, "Note Added", Toast.LENGTH_SHORT).show()
                    }
                })
        }
        HorizontalDivider()
        LazyColumn {
            items(notes) { note ->
                NoteRow(notes = note, onNoteClicked = { onRemoveNote(note) })
            }
        }

    }
}

@Composable
fun NoteRow(
    modifier: Modifier = Modifier,
    notes: Note,
    onNoteClicked: (Note) -> Unit
) {

    Surface(
        modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(topEnd = 33.dp, bottomStart = 33.dp))
            .fillMaxWidth(),
        color = Color(0xFFDFE6EB),
        shadowElevation = 6.dp
    ) {
        Column(
            modifier
                .clickable {
                    onNoteClicked(notes)
                }
                .padding(horizontal = 14.dp, vertical = 6.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(notes.title, style = MaterialTheme.typography.titleSmall)
            Text(notes.description, style = MaterialTheme.typography.titleMedium)
            Text(
                notes.entryDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NotesScreenPreview() {
    NoteScreen(notes = NotesDataSource().loadNotes(), onAddNote = {}, onRemoveNote = {})
}

