package com.example.collins.ui.theme.screens.Main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.collins.ui.theme.WazitoECommerceTheme

@Composable
fun mainscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()) {

    }
}
@Composable
@Preview(showBackground = true)
fun mainscreenPreview(){
    WazitoECommerceTheme {
        mainscreen(navController = rememberNavController())
    }
}