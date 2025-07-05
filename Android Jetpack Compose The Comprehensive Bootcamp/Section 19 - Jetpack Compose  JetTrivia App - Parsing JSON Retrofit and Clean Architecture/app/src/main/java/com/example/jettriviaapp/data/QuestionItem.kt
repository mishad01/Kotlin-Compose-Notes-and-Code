package com.example.jettriviaapp.data

data class QuestionItem(
    val answer: String,
    val category: String,
    val choices: List<String>,
    val question: String
)