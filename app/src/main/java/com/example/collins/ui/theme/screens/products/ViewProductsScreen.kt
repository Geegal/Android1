package com.example.collins.ui.theme.screens.products

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.collins.data.ProductViewModel
import com.example.collins.models.Product
import com.example.collins.navigation.ADD_PRODUCTS_URL
import com.example.collins.navigation.FIRST_URL
import com.example.collins.navigation.LOCATION_URL
import com.example.collins.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewProductsScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var productRepository = ProductViewModel(navController, context)


        val emptyProductState = remember { mutableStateOf(Product("","","","","")) }
        var emptyProductsListState = remember { mutableStateListOf<Product>() }

        var products = productRepository.allProducts(emptyProductState, emptyProductsListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            TopAppBar(
                title = { Text(text = "Other Destination", color = Color.Black, fontWeight = FontWeight.ExtraBold)},
                colors = TopAppBarDefaults.largeTopAppBarColors(Color.LightGray),
                navigationIcon = {
                    IconButton(onClick = {/* Do Something*/ navController.navigate(FIRST_URL) }) {
                        Icon(Icons.Filled.ArrowBack, null)
                    }
                }, actions = {
                    IconButton(onClick = {
                        navController.navigate(LOCATION_URL)}) {
                        Icon(Icons.Filled.LocationOn, null)
                    }
                })

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(products){
                    ProductItem(
                        name = it.name,
                        quantity = it.quantity,
                        price = it.price,
                        id = it.id,
                        navController = navController,
                        productRepository = productRepository,
                        productImage = it.imageUrl
                    )
                }
            }
        }
    }
}

@Composable
fun ProductItem(name:String, quantity:String, price:String, id:String,
                navController:NavHostController,
                productRepository:ProductViewModel, productImage:String) {
    val mContext= LocalContext.current

    Column(modifier = Modifier
        .fillMaxWidth()
        .fillMaxSize()) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 10.dp, end = 10.dp
            ), contentAlignment = Alignment.Center) {
            Image(
                painter = rememberAsyncImagePainter(productImage),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(170.dp),
                contentScale = ContentScale.FillBounds
            )
        }

        Row(modifier = Modifier.padding(start = 20.dp)) {
            Text(text = "Destination Name :", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Text(text = name)
        }

        Row(modifier = Modifier.padding(start = 20.dp)) {
            Text(text = "Additional Information :",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
            Text(text = quantity)
        }
        Row(modifier = Modifier.padding(start = 20.dp)) {
            Text(text = "Tour Guide Contact Information:", fontWeight = FontWeight.Bold,fontSize = 20.sp)
            Text(text = price)

        }

        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = {
                productRepository.deleteProduct(id)
            },shape = RoundedCornerShape(5.dp)  ,
                colors = ButtonDefaults.buttonColors(Color.Red),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)) {
                Text(text = "Delete")

                Spacer(modifier = Modifier.height(20.dp))
            }
        }





    }
}






@Composable
@Preview(showBackground = true)
fun ViewProductsScreenPreview(){
    WazitoECommerceTheme {
        ViewProductsScreen(navController = rememberNavController())
    }
}