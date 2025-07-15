package ar.com.jtsistemas.newcomapp.ui.login


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.com.jtsistemas.newcomapp.R
import ar.com.jtsistemas.newcomapp.ui.theme.nunito
import kotlinx.serialization.Serializable

@Serializable
object MainScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreen() {
    Scaffold(topBar = { TopBarMainScreen() }, modifier = Modifier.fillMaxWidth())
    { innerPadding ->
        BodyMainScreen(modifier = Modifier.padding(innerPadding))
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarMainScreen() {
    CenterAlignedTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 30.sp,
                fontFamily = nunito,
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    painterResource(R.drawable.ic_arrow_back),
                    contentDescription = "volver"
                )
            }
        },
        colors = centerAlignedTopAppBarColors(
            containerColor = colorResource(id = R.color.VerdeOscuro),
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            navigationIconContentColor = colorResource(R.color.white)
        )
    )
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun BodyMainScreen(modifier: Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
    )
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.size(80.dp))
        Text(
            text = stringResource(R.string.titulo),
            fontFamily = nunito,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.size(20.dp))
        Image(
            painter = painterResource(R.drawable.bandera), contentDescription = "bandera",
            modifier = Modifier.size(70.dp)
        )
        Spacer(modifier = Modifier.size(20.dp))
        Image(
            modifier = Modifier.size(70.dp),
            painter = painterResource(R.drawable.pelotavolley),
            contentDescription = "Pelota"
        )
        Spacer(modifier = Modifier.size(20.dp))

        Button(onClick = {},
            modifier= Modifier.width(120.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.Azul),
                contentColor = Color.White
            )
        ) {
            Text(text = stringResource(R.string.equipos))
        }
        Button(onClick = {/* todo */},
            modifier= Modifier.width(120.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.Azul),
                contentColor = Color.White))
            {
                Text(text = stringResource(R.string.jugadores))
            }
        Button (onClick = {},
            modifier= Modifier.width(120.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.Azul),
                contentColor = Color.White
            ))
            {
                Text(text = stringResource(R.string.partidos))
            }

    }
}