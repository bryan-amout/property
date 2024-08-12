package com.example.propertyplus.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_DETAILS
import com.example.propertyplus.navigation.ROUT_INTENT
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.ui.theme.newgreen
import com.example.propertyplus.ui.theme.white

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(white),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TopAppBar(
            title = { Text(text = "Propertyplus") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(newgreen),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu",tint = Color.Red)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "notification",tint = Color.Red)

                }

            }
        )
        Box (modifier = Modifier.height(200.dp),
            contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.home1),
                contentDescription = "home1",
                modifier = Modifier.fillMaxSize()

                )


        }
        Spacer(modifier = Modifier.height(20.dp))
//Search Bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
                placeholder = {Text(text = "What's your location?")}

        )
        //End Search bar
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())) {
            //Card
            Card(){
                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "img",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }


            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(){
                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "img1",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }


            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(){
                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "img2",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }


            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(){
                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "img3",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }


            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(){
                Box (modifier = Modifier
                    .height(180.dp)
                    .width(200.dp),
                    contentAlignment = Alignment.Center){
                    Image(
                        painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "img4",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop

                    )


                }


            }



        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { navController.navigate(ROUT_INTENT)},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(newgreen),
            shape = RoundedCornerShape(20.dp)



        ) {
            Text(text = "Continue")

        }














    }


}
@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}