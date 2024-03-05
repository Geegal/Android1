package com.example.collins.screens.home

import android.app.Notification.Action
import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.GenericFontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.collins.R
import com.example.collins.navigation.ADD_PRODUCTS_URL
import com.example.collins.navigation.CITIES_URL
import com.example.collins.navigation.DESTINATION_URL
import com.example.collins.navigation.FIRST_URL


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    var search by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { Text(text = "Homepage", color = Color.Black, fontWeight = FontWeight.ExtraBold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.LightGray),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(FIRST_URL) }) {
                    androidx.compose.material3.Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {
                    navController.navigate(ADD_PRODUCTS_URL)}) {
                    androidx.compose.material3.Icon(Icons.Filled.Add, null)
                }
            })



        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .size(400.dp)
            )
            Text(
                text = "Let's plan your next vacation!",
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            ) }
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "What's your destination?")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Worldwide Destinations",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))


        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(start = 5.dp)) {

//Box 1
            Card() {
                androidx.compose.foundation.layout.Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                            .clickable {
                                navController.navigate(DESTINATION_URL)
                            }
                    )
                    Text(
                        text = "Paris",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
            Spacer(modifier = Modifier.width(5.dp))


//Box 1
            Card() {
                androidx.compose.foundation.layout.Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                            .clickable {
                                navController.navigate(DESTINATION_URL)
                            }
                    )
                    Text(
                        text = "New York City",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }

            Spacer(modifier = Modifier.width(5.dp))


//Box 1
            Card() {
                androidx.compose.foundation.layout.Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                            .clickable {
                                navController.navigate(DESTINATION_URL)
                            }
                    )
                    Text(
                        text = "London",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }


            Spacer(modifier = Modifier.width(10.dp))


//Box 1
            Card() {
                androidx.compose.foundation.layout.Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(200.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                            .size(400.dp)
                            .clickable {
                                navController.navigate(DESTINATION_URL)
                            }
                    )
                    Text(
                        text = "Manchester",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

            }
        }


        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate(DESTINATION_URL)
            },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            shape = CutCornerShape(5.dp)
        ) {
            Text(text = "Show all", fontSize = 20.sp)
        }





    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}