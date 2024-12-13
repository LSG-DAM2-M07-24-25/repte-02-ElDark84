package com.example.repte02.ui.theme

sealed class Routes(val route: String) {
    object LaunchScreen : Routes("launchScreen")
    object SelectScreen : Routes("selectScreen")
    object NomScreen : Routes("nomScreen")
    object ResultScreen : Routes("resultScreen")

}
