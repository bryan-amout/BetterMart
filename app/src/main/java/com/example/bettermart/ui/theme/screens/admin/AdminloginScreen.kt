package com.example.bettermart.ui.theme.screens.admin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bettermart.R
import com.example.bettermart.navigation.ROUT_HOME
import com.example.bettermart.navigation.ROUT_SIGNUP
import com.example.bettermart.ui.theme.Amber
import com.example.bettermart.ui.theme.White
import com.example.bettermart.ui.theme.newgreen


@Composable
fun AdminloginScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Amber),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.cart),
            contentDescription = "home",
            modifier = Modifier
                .size(150.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Welcome to BetterMart Administrator",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Easier shopping, Better Shopping",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black)
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Please enter your Credentials",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            color = Color.Black)


        Spacer(modifier = Modifier.height(10.dp))

        var emailadmin by remember { mutableStateOf("") }
        var passwordadmin by remember { mutableStateOf("") }


        OutlinedTextField(
            value = emailadmin,
            onValueChange = { emailadmin = it},
            label = { Text(text = "Email Address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = passwordadmin,
            onValueChange = { passwordadmin = it},
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate(ROUT_HOME)},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(newgreen),
            shape = RoundedCornerShape(20.dp)

        ) {
            Text(text = "Login")

        }


    }








    }



@Composable
@Preview(showBackground = true)
fun AdminloginScreenPreview(){
    AdminloginScreen(rememberNavController())
}


