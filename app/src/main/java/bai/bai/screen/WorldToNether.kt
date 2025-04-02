package bai.bai.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WorldToNether(modifier: Modifier = Modifier) {
    var netherCoordinateX by rememberSaveable { mutableStateOf("") }
    var netherCoordinateY by rememberSaveable { mutableStateOf("") }
    var resultX by rememberSaveable { mutableDoubleStateOf(0.0) }
    var resultY by rememberSaveable { mutableDoubleStateOf(0.0) }

    Text(
        "World 2 Nether:",
        fontSize = 20.sp,
    )

    Spacer(modifier.padding(top = 10.dp))

    OutlinedTextField(
        value = netherCoordinateX,
        onValueChange = {
            netherCoordinateX = it
            resultX = it.toDouble() * 8
        },
        label = { Text("Enter World X Coordinate") },
    )

    OutlinedTextField(
        value = netherCoordinateY,
        onValueChange = {
            netherCoordinateY = it
            resultY = it.toDouble() * 8
        },
        label = { Text("Enter World Y Coordinate") },
    )

    Spacer(modifier.padding(top = 10.dp))

    Text("Coordinate in World Is: ", fontSize = 16.sp)
    Text("X: $resultX", fontSize = 30.sp)
    Text("Y: $resultY", fontSize = 30.sp)
}
