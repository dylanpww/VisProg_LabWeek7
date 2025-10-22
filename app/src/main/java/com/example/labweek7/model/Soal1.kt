package com.example.labweek7.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.labweek7.R

@Composable
fun ViewAwal(){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.weather___home_2),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ViewAwalPreview(){
    ViewAwal()
}