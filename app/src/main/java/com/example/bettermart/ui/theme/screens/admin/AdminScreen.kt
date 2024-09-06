package com.example.bettermart.ui.theme.screens.admin

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bettermart.R
import com.example.bettermart.navigation.ADD_CLOTHING_URL
import com.example.bettermart.navigation.ADD_ELECTRONICS_URL
import com.example.bettermart.navigation.ADD_FOODSTUFF_URL
import com.example.bettermart.navigation.ADD_FURNITURE_URL
import com.example.bettermart.navigation.ADD_KITCHENWARE_URL
import com.example.bettermart.navigation.ADD_PERSONALEFFECTS_URL
import com.example.bettermart.navigation.ADD_STATIONERY_URL
import com.example.bettermart.navigation.ADD_TOYS_URL
import com.example.bettermart.navigation.VIEW_CLOTHING_URL
import com.example.bettermart.navigation.VIEW_FOODSTUFF_URL
import com.example.bettermart.navigation.VIEW_FURNITURE_URL
import com.example.bettermart.navigation.VIEW_KITCHENWARE_URL
import com.example.bettermart.navigation.VIEW_STATIONERY_URL
import com.example.bettermart.navigation.VIEW_TOYS_URL
import com.example.bettermart.ui.theme.Amber
import com.example.bettermart.ui.theme.Amber1
import com.example.bettermart.ui.theme.White
import com.example.bettermart.ui.theme.screens.dashboard.bottomNavItems

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AdminScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar (
                    containerColor = Amber1
                ){
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge (containerColor = Color.White){
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }
            },



            //Content Section
            content = @Composable {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),

                    ) {
                    //Body of the screen

                    //Column1

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Amber)
                            .height(160.dp)
                            .padding(top = 28.dp, start = 20.dp, end = 20.dp)
                    ) {

                        Text(
                            text = "Admin Section",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold
                        )

                        Spacer(modifier = Modifier.height(5.dp))



                        Text(
                            text = "Easier Shopping,Better Shopping",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.ExtraBold
                        )


                        Spacer(modifier = Modifier.height(5.dp))

                        //Searchbar
                        var search by remember { mutableStateOf("") }
                        TextField(
                            value = search,
                            onValueChange = { search = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(end = 20.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search"
                                )
                            },
                            placeholder = { Text(text = "Search for products") }
                        )

                        //End of searchbar

                    }
                    //Colum1-End


                    Spacer(modifier = Modifier.height(20.dp))


                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Row {

                            Text(
                                text = "Product Categories",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.ExtraBold
                            )

                            Text(
                                text = "Upload Products",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { }
                            )

                        }

                        Spacer(modifier = Modifier.height(20.dp))


                        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_FURNITURE_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.furniture),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Furniture",
                                    fontSize = 18.sp
                                )

                            }

                            //End of card
                            Spacer(modifier = Modifier.width(20.dp))

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_FOODSTUFF_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.foodstuff),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Foodstuff",
                                    fontSize = 18.sp
                                )

                            }



                            Spacer(modifier = Modifier.width(20.dp))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_CLOTHING_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.furniture),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Clothing",
                                    fontSize = 18.sp
                                )

                            }


                        }


                        Spacer(modifier = Modifier.height(30.dp))

                        Row {

                            Text(
                                text = "Other Products",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.ExtraBold
                            )

                            Text(
                                text = "Upload More Products",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.End,
                                modifier = Modifier.fillMaxWidth()
                            )

                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_STATIONERY_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.stationery),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Stationery",
                                    fontSize = 18.sp
                                )

                            }

                            //End of card
                            Spacer(modifier = Modifier.width(20.dp))

                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_KITCHENWARE_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.kitchenware),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "KItchenware",
                                    fontSize = 18.sp
                                )

                            }



                            Spacer(modifier = Modifier.width(20.dp))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                //Card 1
                                Card(
                                    modifier = Modifier
                                        .height(150.dp)
                                        .width(150.dp)
                                        .clickable { navController.navigate(ADD_TOYS_URL) }
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {

                                        Image(
                                            painter = painterResource(id = R.drawable.toys),
                                            contentDescription = "home",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )

                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))

                                Text(
                                    text = "Toys",
                                    fontSize = 18.sp
                                )

                            }


                        }


                        Spacer(modifier = Modifier.height(120.dp))


                    }


                }



            }
        )





    }






}


val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="dashboard",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Products",
        route="dashboard",
        selectedIcon=Icons.Filled.Star,
        unselectedIcon=Icons.Outlined.Star,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Make Order",
        route="dashboard",
        selectedIcon=Icons.Filled.Star,
        unselectedIcon=Icons.Outlined.Star,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Login",
        route="login",
        selectedIcon=Icons.Filled.Person,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = false,
        badges=0
    ),






    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun AdminScreenPreview(){
    AdminScreen(rememberNavController())}
