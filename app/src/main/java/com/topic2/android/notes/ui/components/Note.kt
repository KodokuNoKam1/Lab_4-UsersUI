package com.topic2.android.notes.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.theme.rwGreen
import androidx.compose.foundation.background

@Composable fun Note(){
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(rwGreen)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Заголовок", maxLines = 1)
            Text(text = "Содержимое", maxLines = 1)
        }
        Checkbox(
            checked = false,
            onCheckedChange = { },
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}
@Preview
@Composable
private fun NotePreview(){ Note()
}