package com.example.qurankarim.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CustomToolbarHome() {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Quran Karim",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        )
    }
}