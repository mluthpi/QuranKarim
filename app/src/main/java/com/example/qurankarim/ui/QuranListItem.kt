package com.example.qurankarim.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.qurankarim.dummydata.QuranData
import com.example.qurankarim.dummydata.Surah
import com.example.qurankarim.ui.theme.QuranKarimTheme

@Preview
@Composable
fun QuranListScreen() {
    QuranKarimTheme {
        LazyColumn() {
            item {
                val surahList = QuranData.surahList
                surahList.forEachIndexed { index, surah ->
                    QuranListItem(surah)
                }
            }
        }
    }
}

@Composable
fun QuranListItem(surah: Surah) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = surah.nomorSurat.toString())
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = surah.name)
            Row {
                Text(text = surah.arti)
                Text(text = "${surah.jumlahAyat} Ayat",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
        Text(
            text = "ayat",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.End
        )
    }
}