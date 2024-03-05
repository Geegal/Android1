package com.example.collins.ui.theme.screens.heritage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.collins.ui.theme.WazitoECommerceTheme

@Composable
fun heritagescreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()) {
        Text(
            text = "Plan your Trip ",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
@Composable
@Preview(showBackground = true)
fun heritagescreenPreview(){
    WazitoECommerceTheme {
        heritagescreen(navController = rememberNavController())
    }
}