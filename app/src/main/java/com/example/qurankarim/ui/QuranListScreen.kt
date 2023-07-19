package com.example.qurankarim.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.qurankarim.dummydata.QuranData
import com.example.qurankarim.dummydata.Surah
import com.example.qurankarim.ui.theme.CustomToolbarHome
import com.example.qurankarim.R

@Preview(showBackground = true)
@Composable
fun QuranListScreen() {
    Surface {
        Column(modifier = Modifier.fillMaxSize()) {
            CustomToolbarHome()
            Text(
                text = "Hi, Asslamualaikum",
                fontSize = 14.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.banner_home),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
                contentScale = ContentScale.FillHeight
            )
            Text(
                text = "Surah",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            )
            LazyColumn {
                item {
                    val surahList = QuranData.surahList
                    surahList.forEachIndexed { index, surah ->
                        QuranListItem(surah)
                    }
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
            .padding(start = 24.dp, end = 24.dp, bottom = 24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = surah.nomorSurat.toString())
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = surah.name)
            Row {
                Text(text = surah.arti)
                Text(
                    text = "${surah.jumlahAyat} Ayat",
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