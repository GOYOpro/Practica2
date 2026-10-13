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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.example.myapplication.R
import java.util.function.DoubleUnaryOperator

@Composable
fun InicioScreen(modifier : Modifier, numero: Int, click:() -> Unit ) {
    Column(
        modifier = Modifier
    ) {
        var entrada1 by remember { mutableStateOf("") }
        var entrada2 by remember { mutableStateOf("") }
        var impresion by remember { mutableStateOf("")}
        Spacer(modifier = Modifier.padding(20.dp))


        TextField(
            value = entrada1,
            onValueChange = { entrada1 = it},
            label = {Text("Cantidad")},
            singleLine = true
        )

        Spacer(modifier = Modifier.padding(20.dp))

        TextField(
            value = entrada2,
            onValueChange = { entrada2 = it},
            label = {Text("Letra")},
            singleLine = true
        )

        Spacer(modifier = Modifier.padding(20.dp))

        Button(onClick = {
           var veces = entrada1.toInt();
           var contador = "";
            for(i in 1.. veces){
                contador+= entrada2;
        }
            impresion = contador;
        }) {
            Text(text = "Imprimir")
        }


        Text(text = "$impresion")
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