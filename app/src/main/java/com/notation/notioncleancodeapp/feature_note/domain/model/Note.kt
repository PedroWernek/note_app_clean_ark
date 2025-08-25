package com.notation.notioncleancodeapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.notation.notioncleancodeapp.ui.theme.BabyBlue
import com.notation.notioncleancodeapp.ui.theme.LightGreen
import com.notation.notioncleancodeapp.ui.theme.RedOrange
import com.notation.notioncleancodeapp.ui.theme.RedPink
import com.notation.notioncleancodeapp.ui.theme.Violet

//data class - classe de armazenamento de dados
@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    //companion object -> {
    //  serve como uma forma de associar membros
    //  (propriedades e funções) a uma classe, em
    //  vez de a instâncias específicas da classe
    // }
    companion object{
        //cores que a nota pode ter definidos la no ui.themes.Color.kt
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)