import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.*
import com.example.repte02.ui.theme.Routes

class MainActivity : ComponentActivity() {
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
