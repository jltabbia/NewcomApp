package ar.com.jtsistemas.newcomapp.ui.teams

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.com.jtsistemas.newcomapp.R
import ar.com.jtsistemas.newcomapp.ui.theme.nunito
import kotlinx.serialization.Serializable

@Serializable
object TeamsScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TeamsScreen() {
    Scaffold(topBar = { TopBarTeamsScreen() }, modifier = Modifier.fillMaxWidth())
    { innerPadding ->
        BodyTeamsScreen(modifier = Modifier.padding(innerPadding))
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarTeamsScreen() {
    CenterAlignedTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top) {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 30.sp,
                fontFamily = nunito,
                fontWeight = FontWeight.Bold
            )
            Text(text=stringResource(R.string.equipos), fontSize = 18.sp)
            }
        },
        colors = centerAlignedTopAppBarColors(
            containerColor = colorResource(id = R.color.VerdeOscuro),
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun BodyTeamsScreen(modifier: Modifier) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(R.color.background)))
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text="Pantalla de Teams")

    }
}


