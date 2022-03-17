package com.mukundi.clearscoreassessment.errors

import java.net.UnknownHostException

import com.mukundi.clearscoreassessment.R
import com.mukundi.clearscoreassessment.errors.CSException.ErrorType

object ErrorMapper {

    fun map(throwable: Throwable): CSException {

        var errorType = ErrorType.UNKNOWN
        var messageResourceId = R.string.error_unknown

        // error mapping
        if (throwable is UnknownHostException) {
            errorType = ErrorType.SERVER
            messageResourceId = R.string.error_network
        }

        return CSException(errorType, messageResourceId)
    }
}
