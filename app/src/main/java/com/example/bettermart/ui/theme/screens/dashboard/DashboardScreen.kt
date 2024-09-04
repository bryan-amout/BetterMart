package com.example.bettermart.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bettermart.R
import com.example.bettermart.navigation.VIEW_CLOTHING_URL
import com.example.bettermart.navigation.VIEW_ELECTRONICS_URL
import com.example.bettermart.navigation.VIEW_FOODSTUFF_URL
import com.example.bettermart.navigation.VIEW_FURNITURE_URL
import com.example.bettermart.navigation.VIEW_KITCHENWARE_URL
import com.example.bettermart.navigation.VIEW_PERSONALEFFECTS_URL
import com.example.bettermart.navigation.VIEW_STATIONERY_URL
import com.example.bettermart.navigation.VIEW_TOYS_URL
import com.example.bettermart.ui.theme.Amber
import com.example.bettermart.ui.theme.White

@Composable
fun DashboardScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Amber),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(10.dp))
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
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Easier shopping, Better Shopping",
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black)
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Start Card
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(700.dp), shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp), colors = CardDefaults.cardColors(
                White)){



                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(VIEW_FURNITURE_URL) },
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.furniture),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Furniture",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card
                    Spacer(modifier = Modifier.width(20.dp))
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(VIEW_FOODSTUFF_URL) },
                        elevation = CardDefaults.cardElevation(20.dp),
                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.foodstuff),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Foodstuff",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card


                }
                //End of row

                //Row2
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_CLOTHING_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.clothing),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "clothings",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card
                    Spacer(modifier = Modifier.width(20.dp))
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_STATIONERY_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),

                        ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.stationery),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Stationery",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card


                }
                //Row2end
                //ROw3
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_KITCHENWARE_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.kitchenware),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "KitchenWare",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card
                    Spacer(modifier = Modifier.width(20.dp))
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_TOYS_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.toys),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Toys",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card


                }
                //Row3end
                //ROw4
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_ELECTRONICS_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.electronics),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Electronics",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card
                    Spacer(modifier = Modifier.width(20.dp))
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .clickable { navController.navigate(VIEW_PERSONALEFFECTS_URL)}
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.personal),
                                    contentDescription ="home", Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Personal effects",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card


                }
                //Row4end

            }
            //End Card
        }




    }


}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())}
