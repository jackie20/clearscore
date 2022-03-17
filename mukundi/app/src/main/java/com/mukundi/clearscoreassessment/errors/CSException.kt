package com.mukundi.clearscoreassessment.errors

class CSException(val errorType: ErrorType, val messageResId: Int) : Throwable() {

    enum class ErrorType {
        SERVER, UNKNOWN
    }
}
