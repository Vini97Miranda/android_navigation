package com.stu70973.simplenavigation

sealed class Routes(val route: String) {
    object FirstScreen : Routes("first_screen")
    object SecondScreen : Routes("second_screen")
    object ThirdScreen : Routes("third_screen")
}