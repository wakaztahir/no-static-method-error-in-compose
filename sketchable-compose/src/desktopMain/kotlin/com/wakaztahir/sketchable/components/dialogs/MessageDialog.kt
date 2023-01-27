package com.wakaztahir.sketchable.components.dialogs

//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.AlertDialog
//import androidx.compose.material.ExperimentalMaterialApi
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp

//@OptIn(ExperimentalMaterialApi::class)
//@Composable
//actual fun MessageDialog(
//    onDismissRequest: () -> Unit,
//    title: String,
//    message: @Composable () -> Unit,
//    onConfirm: () -> Unit,
//    confirmText: String?,
//    cancelText: String?,
//    onCancel: () -> Unit
//) {
//    AlertDialog(
//        modifier = Modifier.padding(24.dp),
//        onDismissRequest = onDismissRequest,
//        confirmButton = {
//            if (confirmText != null) {
//                TextButton(onClick = onConfirm) {
//                    Text(text = confirmText)
//                }
//            }
//        },
//        dismissButton = if (cancelText != null) {
//            {
//                TextButton(onClick = onCancel) {
//                    Text(text = cancelText)
//                }
//            }
//        } else null,
//        title = {
//            Text(text = title)
//        },
//        text = {
//            message()
//        }
//    )
//}