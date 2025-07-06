package com.example.jettriviaapp.data

// ✅ Fix the naming
data class DataOrException<T, BooleanState, E : Exception>(
    var data : T? = null,
    var loading : BooleanState? = null,
    var e : E? = null
)
