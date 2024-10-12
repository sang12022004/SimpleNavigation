package com.example.simplenavigation

sealed class Screen(val router:String){
    object Login:Screen(router = "login_screen")
    object Register:Screen(router = "register_screen")
}