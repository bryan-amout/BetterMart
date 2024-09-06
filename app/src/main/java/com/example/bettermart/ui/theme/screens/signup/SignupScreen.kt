package com.example.bettermart.ui.theme.screens.signup

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
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.example.bettermart.R
import com.example.bettermart.data.AuthViewModel
import com.example.bettermart.navigation.ROUT_LOGIN
import com.example.bettermart.navigation.ROUT_SIGNUP
import com.example.bettermart.ui.theme.Amber
import com.example.bettermart.ui.theme.Amber1
import com.example.bettermart.ui.theme.newgreen



@Composable
fun SignupScreen(navController: NavController){
    Column (modifier = Modifier
        .background(color = Amber)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(50.dp))


        Image(
            painter = painterResource(id = R.drawable.cart),
            contentDescription = "home",
            modifier = Modifier
                .size(150.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "BetterMart",
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Magenta)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Easier shopping, Better Shopping",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black)
        Spacer(modifier = Modifier.height(10.dp))

        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange = { name = it},
            label = { Text(text = "Fullname")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it},
            label = { Text(text = "Email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Account")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = confpassword,
            onValueChange = { confpassword = it},
            label = { Text(text = "Confirm Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),

        )
        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)


        Button(
            onClick = {
                authViewModel.signup(name, email, password,confpassword)

            },
            modifier = Modifier,
            colors = ButtonDefaults.buttonColors(Amber1),
            shape = RoundedCornerShape(5.dp)



        ) {
            Text(text = "Create Account")


        }
        Spacer(modifier = Modifier.height(10.dp))


        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Already have an account? Go to Login",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.clickable {navController.navigate(ROUT_LOGIN)},
            textAlign = TextAlign.Center,
            color = Color.Black)








    }


}
@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}