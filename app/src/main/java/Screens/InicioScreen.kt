package Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Label
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import android.R.attr.value
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.example.myapplication.R
import java.util.function.DoubleUnaryOperator
import androidx.compose.foundation.lazy.items
import android.util.Log.i
import androidx.compose.runtime.mutableStateListOf
@Composable
fun InicioScreen(modifier : Modifier, numero: Int, click:() -> Unit ) {
    Column(
        modifier = Modifier
    ) {
        var entrada1 by remember { mutableStateOf("") }
        val nombres = remember { mutableStateListOf<String>() }
        Spacer(modifier = Modifier.padding(20.dp))

        Column(modifier = Modifier) {
            Box(modifier = Modifier)
        }

        TextField(
            value = entrada1,
            onValueChange = { entrada1 = it},
            label = {Text("Nombre")},
            singleLine = true
        )

        Spacer(modifier = Modifier.padding(20.dp))


        Button(onClick = {
            nombres.add(entrada1);
            entrada1 = ""
        }) {
            Text(text = "Agregar")
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items( nombres) { nombre ->
                Insert(modifier, nombre)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInicio()
{
}

// Forma en la que se delara una lista de Strings
// val perros = listOff<String>("Chihuahua", "Pitbull, "Labrador")

//Forma en la que se recorre una lista de Strings
//perros.forEach { perros -> println(perros) }

//Forma en la que obtenemos la posicion de una dato del arreglo
//perros.forEachIndex { indice, perros -> println("Posicion $indice: $perros")