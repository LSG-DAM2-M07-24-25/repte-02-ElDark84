import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.repte02.R
import com.example.repte02.ui.theme.Routes

@Composable
fun SelectScreen(navController: NavController) {
    val characters = listOf(
        R.drawable.gomah, R.drawable.goku, R.drawable.vegeta,
        R.drawable.piccolo, R.drawable.supreme, R.drawable.masked_majin
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(76.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(characters.size) { index ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .height(100.dp)
                        .fillMaxWidth(),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Image(
                        painter = painterResource(id = characters[index]),
                        contentDescription = "Character Image",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                navController.navigate(Routes.NomScreen.route)  // Navegar a NomScreen
            },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Continuar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectScreenPreview() {
    val navController = rememberNavController()
    SelectScreen(navController = navController)
}
