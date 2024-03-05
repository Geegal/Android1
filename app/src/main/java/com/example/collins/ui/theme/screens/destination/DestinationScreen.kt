package com.example.collins.screens.destinations

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.collins.R
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import com.example.collins.navigation.ADD_PRODUCTS_URL
import com.example.collins.navigation.CITIES_URL
import com.example.collins.navigation.CONTACT_URL
import com.example.collins.navigation.DESTINATION_URL
import com.example.collins.navigation.HOME_URL
import com.example.collins.navigation.LOCATION_URL
import com.example.collins.navigation.VIEW_PRODUCTS_URL


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DestinationScreen(navController: NavController){
    var search1 by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar -displays information and actions relating to the current screen and is placed at the top of the screen.
        TopAppBar(
            title = { Text(text = "Destination", color = Color.Black, fontWeight = FontWeight.ExtraBold)},
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.LightGray),
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(DESTINATION_URL) }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ navController.navigate(LOCATION_URL)}) {
                    Icon(Icons.Filled.LocationOn, null)
                }
            })

        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(value = search1,
            onValueChange = { search1= it },
            placeholder = { Text(text = "What's your destination?")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            })

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Destinations",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black,
            fontFamily = FontFamily.SansSerif
        )

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Row1
            Row(modifier = Modifier.padding(start = 5.dp)) {

                //Card1
                Card() {

                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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
                                        navController.navigate(CITIES_URL)
                                    }
                            )

                        }
                        Text(
                            text = "London",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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
                                        navController.navigate(CITIES_URL)
                                    }
                            )

                        }
                        Text(
                            text = "Tokyo",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))


            //Row2
            Row(modifier = Modifier.padding(start = 5.dp)) {

                //Card1
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Boston",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Toronto",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))


            //Row3
            Row(modifier = Modifier.padding(start = 5.dp)) {

                //Card1
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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
                                    .clickable {
                                        navController.navigate(DESTINATION_URL)
                                    }
                            )

                        }
                        Text(
                            text = "Dubai",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Sychelles",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))


            //Row4
            Row(modifier = Modifier.padding(start = 5.dp)) {

                //Card1
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Sydney",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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
                                    .clickable {
                                        navController.navigate(DESTINATION_URL)
                                    }
                            )

                        }
                        Text(
                            text = "Chicago",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))


            //Row5
            Row(modifier = Modifier.padding(start = 5.dp)) {

                //Card1
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Mexico",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }
                Spacer(modifier = Modifier.width(10.dp))
                //Card2
                Card() {
                    Column() {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),
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

                        }
                        Text(
                            text = "Accra",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                             navController.navigate(VIEW_PRODUCTS_URL)
            },
                colors = ButtonDefaults.buttonColors(Color.Red),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)
            ) {
                Text(text = "Other Destinations")
            }

            Spacer(modifier = Modifier.height(30.dp))


        }


    }


}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    DestinationScreen(rememberNavController())
}
