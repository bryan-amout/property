package com.example.propertyplus.ui.theme.screens.dashbord

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
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.newgreen
import com.example.propertyplus.ui.theme.white

@Composable
fun DashboardScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(white),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Propertyplus",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta)
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = R.drawable.icon),
            contentDescription = "home",
            modifier = Modifier
                .size(80.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Manage your properties with ease",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black)
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Start Card
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(700.dp), shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp), colors = CardDefaults.cardColors(newgreen)){



                //Row1
                Row (modifier = Modifier.padding(20.dp)){
                    //card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable { navController.navigate(ROUT_HOME) },
                        elevation = CardDefaults.cardElevation(20.dp),
                        colors = CardDefaults.cardColors(Color.Red)
                        ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.icon),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Home",
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
                        .clickable { navController.navigate(ROUT_PROPERTY) },
                        elevation = CardDefaults.cardElevation(20.dp),
                        ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.property),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "property",
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
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.profile),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "profile",
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
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp),

                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.settings),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Setting",
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
                        .height(180.dp)
                        .clickable { navController.navigate(ADD_PRODUCTS_URL) },
                        elevation = CardDefaults.cardElevation(20.dp),
                    ){
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.add),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "Add",
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
                        .clickable { navController.navigate(VIEW_PRODUCTS_URL) },
                        elevation = CardDefaults.cardElevation(20.dp),
                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box (
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(painter = painterResource(id = R.drawable.view),
                                    contentDescription ="home",Modifier.size(100.dp) )
                                Spacer(modifier = Modifier.height(10.dp))

                            }
                            Text(
                                text = "View",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                fontSize = 18.sp
                            )

                        }

                    }
                    //end card


                }
                //Row3end

            }
            //End Card
        }




    }


}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}