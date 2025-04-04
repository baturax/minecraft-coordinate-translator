package bai.bai.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NetherToWorld(modifier: Modifier = Modifier) {
    var worldCoordinateX by rememberSaveable { mutableStateOf("") }
    var worldCoordinateY by rememberSaveable { mutableStateOf("") }
    var resultX by rememberSaveable { mutableStateOf(0.0f) }
    var resultY by rememberSaveable { mutableStateOf(0.0f) }

    Column(modifier = modifier) {
        Text(
            "Nether 2 World:",
            fontSize = 20.sp,
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        OutlinedTextField(
            value = worldCoordinateX,
            onValueChange = {
                worldCoordinateX = it
                resultX =
                    it.toFloatOrNull()?.times(8) ?: 0f
            },
            label = { Text("Enter Nether X Coordinate") },
            placeholder = { Text("X Coordinate") },
            keyboardOptions =
                KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done,
                ),
        )

        OutlinedTextField(
            value = worldCoordinateY,
            onValueChange = {
                worldCoordinateY = it
                resultY = it.toFloatOrNull()?.times(8)
                    ?: 0f
            },
            label = { Text("Enter Nether Y Coordinate") },
            placeholder = { Text("Y Coordinate") },
            keyboardOptions =
                KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done,
                ),
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Text("Coordinate in World Is:", fontSize = 16.sp)
        Text("X: $resultX", fontSize = 30.sp)
        Text("Y: $resultY", fontSize = 30.sp)
    }
}
