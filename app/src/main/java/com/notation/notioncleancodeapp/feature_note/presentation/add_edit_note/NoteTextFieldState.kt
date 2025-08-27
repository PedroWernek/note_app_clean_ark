package com.notation.notioncleancodeapp.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHiltVisible: Boolean = true
)
