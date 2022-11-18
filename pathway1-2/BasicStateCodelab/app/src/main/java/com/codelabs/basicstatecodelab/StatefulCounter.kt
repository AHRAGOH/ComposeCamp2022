package com.codelabs.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var waterCount by rememberSaveable { mutableStateOf(0) }
//    var juiceCount by rememberSaveable { mutableStateOf(0) }

    StatelessCounter(waterCount, { waterCount++ }, modifier)
//    StatelessCounter(juiceCount, { juiceCount++ }, modifier)
}