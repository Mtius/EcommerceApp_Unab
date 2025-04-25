package co.edu.unab.ecommerceapp.santiagomatheus

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.test.espresso.base.Default
import coil3.compose.rememberAsyncImagePainter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())
            MediumTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        "Medium Top App Bar",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                            contentDescription = "Localized description"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }
    ){ innerPadding ->
        Column (modifier = Modifier.padding(innerPadding)){
            Text(
                "Promociones", modifier = Modifier.padding(
                    top = 16.dp,
                    start = 16.dp,
                    bottom = 8.dp
                )
            )

            val listUrls = listOf(
                "https://static.vecteezy.com/system/resources/previews/005/513/456/non_2x/big-sale-banner-promotion-abstract-background-yellow-blue-color-design-vector.jpg",
                "https://www.shutterstock.com/image-vector/flash-sale-promo-banner-template-260nw-2353121123.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6IhxAvsUf3EeNM0ot7mI-EEsITas6ENidlw&s",
                "https://img.pikbest.com/origin/09/26/09/48TpIkbEsTbgz.jpg!w700wp",
                "https://img.freepik.com/psd-premium/promocion-plantilla-banner-descuento-mega-venta_501916-114.jpg",
            )
            LazyRow (
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)

            ) {
                item { CardPromo(listUrls[0]) }
                item { CardPromo(listUrls[1]) }
                item { CardPromo(listUrls[2]) }
                item { CardPromo(listUrls[3]) }
                item { CardPromo(listUrls[4]) }

            }

        }
    }
}

@Preview
@Composable
fun CardPromo(url: String){
    Card(modifier = Modifier.height(180.dp).width(300.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(url),
            contentDescription = "Promocion",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}


@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
