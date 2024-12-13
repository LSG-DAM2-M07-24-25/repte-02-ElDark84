import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.repte02.R
import com.example.repte02.ui.theme.Routes
import java.lang.reflect.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.input.ImeAction
import androidx.navigation.compose.rememberNavController


@Composable
fun ResultScreen(navController: NavController, selectedCharacter: Int, userName: String) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Contenedor de la columna para los elementos
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo de Dragon Ball
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Logo",
                modifier = Modifier
                    .height(200.dp) // Usa height en lugar de size
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Imagen del personaje seleccionado
            Image(
                painter = painterResource(id = selectedCharacter),
                contentDescription = "Character Image",
                modifier = Modifier
                    .height(150.dp) // Usa height en lugar de size
                    .padding(8.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nombre ingresado
            Text(
                text = "Hola, $userName!",
                fontSize = 24.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Botón "Volver" para regresar a la pantalla de selección
            Button(
                onClick = { navController.navigate(Routes.SelectScreen.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Volver")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    ResultScreen(navController = rememberNavController(), selectedCharacter = R.drawable.goku, userName = "Goku")
}

