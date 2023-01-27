package com.wakaztahir.sketchable

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalTextApi::class)
@Composable
fun CanvasBaby(){
    val textMeasurer = rememberTextMeasurer()
    val measurement = remember {
        textMeasurer.measure(
            text = buildAnnotatedString {
                pushStyle(SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic))
            }
        )
    }
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawText(
            textLayoutResult = measurement
        )
    }
}