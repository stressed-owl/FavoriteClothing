package com.cute_white_bear.favoriteclothing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cute_white_bear.favoriteclothing.data.Datasource
import com.cute_white_bear.favoriteclothing.model.Clothing
import com.cute_white_bear.favoriteclothing.ui.theme.FavoriteClothingTheme
import com.cute_white_bear.favoriteclothing.ui.theme.openSans

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FavoriteClothingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FavoriteClothingUI()
                }
            }
        }
    }
}

@Composable
fun FavoriteClothingList(
    favoriteList: List<Clothing>,
    modifier: Modifier = Modifier
) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(1),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.height(350.dp),
    ) {
        items(favoriteList) { favorite -> 
            FavoriteCard(favorite)
        }
    }
}

@Composable
fun FavoriteCard(
    clothing: Clothing,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(10.dp),
    ) {
        Column {
            Image(
                painter = painterResource(clothing.image),
                contentDescription = stringResource(clothing.type),
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FavoriteClothingUI() {
    Column(
        Modifier
            .padding(8.dp),
    ) {
        Image(
            painter = painterResource(R.drawable.h_and_m_logo),
            contentDescription = null,
            modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 16.dp)
        )
        LazyColumn(verticalArrangement = Arrangement.spacedBy(32.dp)) {
            item {
                FavoriteCategory(R.string.pants)
                FavoriteClothingList(favoriteList = Datasource.returnPants())
            }
            
            item {
                FavoriteCategory(R.string.shoes)
                FavoriteClothingList(favoriteList = Datasource.returnShoes())
            }
            
            item {
                FavoriteCategory(R.string.hoodie)
                FavoriteClothingList(favoriteList = Datasource.returnHoodies())
            }

            item {
                FavoriteCategory(R.string.t_shirt)
                FavoriteClothingList(favoriteList = Datasource.returnTShirt())
            }
            
            item {
                FavoriteCategory(R.string.accessory)
                FavoriteClothingList(favoriteList = Datasource.returnAccessory())
            }
        }
    }
}

@Composable
private fun FavoriteCategory(
    @StringRes category: Int,
    modifier: Modifier = Modifier,
) {
    Text(
        text = stringResource(category),
        color = Color(0xFF121212),
        fontSize = 30.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier.padding(start = 6.dp, bottom = 8.dp),
        fontFamily = openSans
    )
}

