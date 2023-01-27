package com.wakaztahir.sketchable.utils

import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc

@Composable
internal actual fun stringResource(res: StringResource): String {
    return StringDesc.Resource(res).toString()
}