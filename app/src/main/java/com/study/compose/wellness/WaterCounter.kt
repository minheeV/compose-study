package com.study.compose.wellness

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.study.compose.R


@Composable
fun StatefulCounter() {
    var waterCount by rememberSaveable { mutableStateOf(0) }
    var juiceCount by rememberSaveable { mutableStateOf(0) }

    StatelessCounter(waterCount, { waterCount++ })
    StatelessCounter(juiceCount, { juiceCount++ })
}

@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text(stringResource(R.string.water_count))
        }
        Button(
            onClick = onIncrement,
            Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            Text(stringResource(R.string.water_count_add_btn))
        }
    }
}

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count by rememberSaveable { mutableStateOf(0) }
        if (count > 0) {
            Text(stringResource(id = R.string.water_count, count))
        }
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text(stringResource(R.string.water_count_add_btn))
        }
    }
/*    Column(modifier = modifier.padding(16.dp)) {
        var count by remember { mutableStateOf(0) }
        if (count > 0) {
            var showTask by remember { mutableStateOf(true) }
            if (showTask) {
                WellnessTaskItem(
                    taskName = stringResource(R.string.water_count_task),
                    onClose = { showTask = false })
            }
            Text(stringResource(id = R.string.water_count, count))
        }
        Row(Modifier.padding(top = 8.dp)) {
            Button(
                onClick = { count++ },
                Modifier.padding(top = 8.dp),
                enabled = count < 10
            ) {
                Text(stringResource(R.string.water_count_add_btn))
            }
            Button(
                onClick = { count = 0 },
                Modifier.padding(start = 8.dp)
            ) {
                Text(stringResource(R.string.water_count_clear_btn))
            }
        }

    }*/
}
