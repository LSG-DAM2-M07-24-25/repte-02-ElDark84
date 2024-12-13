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
import androidx.compose.ui.unit.sp
import com.example.repte02.R
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.repte02.ui.theme.Routes


class LaunchScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Routes.LaunchScreen.route
            ) {
                composable(Routes.LaunchScreen.route) {
                    LaunchScreen(navController)
                }
                composable(Routes.SelectScreen.route) {
                    SelectScreen(
                        navController = TODO()
                    )
                }
            }
        }
    }
}

@Composable
fun LaunchScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Image(contentScale = ContentScale.FillBounds
            , painter = painterResource(id = R.drawable.dragonball_daima_logo)
            , contentDescription = "Descripció"
            , modifier = Modifier
                .height(540.dp)
                .width(540.dp)
        )
        Spacer(modifier = Modifier.height(2.dp))
        Button(onClick = { navController.navigate(Routes.SelectScreen.route)}) {
            Text(text = "Entrar", fontSize = 30.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLaunchScreen() {
    val navController = rememberNavController()
    LaunchScreen(navController = navController)
}
