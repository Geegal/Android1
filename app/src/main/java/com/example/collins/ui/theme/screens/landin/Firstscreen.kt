package com.example.collins.ui.theme.screens.landin

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.collins.R
import com.example.collins.navigation.CONTACT_URL
import com.example.collins.ui.theme.WazitoECommerceTheme

@Composable
fun Firstscreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

        ) {



        //Centering an image
Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

    val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.firstscreen))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(composition, progress,
        modifier = Modifier.size(300.dp)
    )
}

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Plan your Trip ",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Are you ready to embark on an unforgettable adventure? With our tour guide app, planning your dream trip has never been easier! ",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
                         navController.navigate(CONTACT_URL)

        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)
        ) {
            Text(text = "Continue")
        }






    }
}
@Composable
@Preview(showBackground = true)
fun FirstscreenPreview(){
    WazitoECommerceTheme {
        Firstscreen(navController = rememberNavController())
    }
}