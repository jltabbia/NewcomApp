package ar.com.jtsistemas.newcomapp.ui.login

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
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ar.com.jtsistemas.newcomapp.R
import ar.com.jtsistemas.newcomapp.data.login.mvvm.LoginViewModel
import ar.com.jtsistemas.newcomapp.ui.theme.nunito
import kotlinx.serialization.Serializable

@Serializable
object LoginScreen


//private val loginviewmodel: LoginViewModel by viewModels { LoginViewModelFactory(emptyList()) }
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {
    Scaffold(topBar = { TopBarLoginScreen() }, modifier = Modifier.fillMaxWidth())
    { innerPadding ->
        BodyLoginScreen(modifier = Modifier.padding(innerPadding))
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarLoginScreen() {
    CenterAlignedTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 34.sp,
                fontFamily = nunito,
                fontWeight = FontWeight.Bold
            )
        },
        colors = centerAlignedTopAppBarColors(
            containerColor = colorResource(id = R.color.VerdeOscuro),
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        )
    )
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun BodyLoginScreen(modifier: Modifier) {
    var usuario: String by remember { mutableStateOf("") }
    var contrasena: String by remember { mutableStateOf("") }
    var verContrasena: Boolean by remember { mutableStateOf(false) }

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
        Spacer(modifier = Modifier.size(100.dp))
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
        Text(
            text = stringResource(R.string.acceso),
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(
            value = usuario,
            onValueChange = { usuario = it },
            label = {
                Text(
                    text = stringResource(R.string.usuario),
                    fontFamily = nunito,
                    fontSize = 18.sp
                )
            },
            leadingIcon = {
                Icon(painterResource(R.drawable.ic_account), contentDescription = "usuario")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            label = {
                Text(
                    text = stringResource(R.string.contraseña),
                    fontFamily = nunito,
                    fontSize = 18.sp,

                    )
            },
            leadingIcon = {
                Icon(painterResource(R.drawable.ic_key), contentDescription = "password")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                //val verimagen =

                IconButton(onClick = { verContrasena = !verContrasena }) {
                    if (verContrasena) {
                        Icon(painterResource(R.drawable.ic_visibility_off), contentDescription = "")

                    } else {
                        Icon(painterResource(R.drawable.ic_visibility), contentDescription = "")
                    }
                }
            },
            visualTransformation = if (verContrasena) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },

            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(R.string.forgot),
            fontSize = 18.sp,
            fontFamily = nunito,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.Azul),
            modifier = Modifier
                .align(Alignment.End)
                .padding(5.dp)
                .clickable(onClick = {})
        )
        Spacer(modifier = Modifier.size(20.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.teal_700))
        ) {
            Text(
                text = stringResource(R.string.ingresar),
                color = colorResource(R.color.white),
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )

        }

    }
}


