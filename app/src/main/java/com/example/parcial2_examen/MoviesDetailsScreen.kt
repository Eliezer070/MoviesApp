package com.example.parcial2_examen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoviesDetails(modifier: Modifier) {
        var checked by remember { mutableStateOf(false) }

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }
            )

            val imageModifier = Modifier
                .size(100.dp)

            Image(
                painter = painterResource(R.drawable.movie_image),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = imageModifier
            )

            Column {
                Text(text = "Felicidades has llegado al final", Modifier.padding(start = 8.dp),fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }

}