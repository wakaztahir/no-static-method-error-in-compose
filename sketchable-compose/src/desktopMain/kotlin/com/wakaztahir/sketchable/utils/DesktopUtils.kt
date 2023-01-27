package com.wakaztahir.sketchable.utils

actual fun Throwable.logIt(message: String, report: Boolean) {
    if(message.isNotEmpty()) println(message)
    printStackTrace()
    if(report){
        //todo report the error
    }
}