package com.example.collins.ui.theme.screens.location

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LocationScreen(navController: NavHostController){
    val mUrl = "https://www.google.com/maps/@-1.2723647,36.7927116,15z?entry=ttu"

    AndroidView(factory = {
        WebView(it).apply{
            settings.javaScriptEnabled=true
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            webViewClient = WebViewClient()
            loadUrl(mUrl)
        }
    }, update = { it.loadUrl(mUrl) })


}


@Preview(showBackground = true)
@Composable
fun LocationScreenPreview() {
    LocationScreen(rememberNavController())
}