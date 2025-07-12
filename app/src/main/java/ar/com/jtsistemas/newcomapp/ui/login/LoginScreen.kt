package ar.com.jtsistemas.newcomapp.ui.login

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    Scaffold(topBar = {TopBarLoginScreen()}, modifier = Modifier.fillMaxWidth() )
    { innerPadding ->

    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarLoginScreen() {
    CenterAlignedTopAppBar(modifier = Modifier.fillMaxWidth(), title = { Text(text="Newcom") })

}