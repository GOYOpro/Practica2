package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
@Composable
fun Insert(modifier: Modifier = Modifier, nombre: String) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .border(
                width = 2.dp,
                color = Color.Red,
                shape = RoundedCornerShape(size = 12.dp)
            )
            .background(Color.White)
    ) {
        Text(text = nombre)
    }
}