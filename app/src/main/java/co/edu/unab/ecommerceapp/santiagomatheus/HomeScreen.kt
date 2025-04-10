package co.edu.unab.ecommerceapp.santiagomatheus

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp



@Composable
fun HomeScreen(){
    Scaffold { innerPadding ->
        Column (modifier = Modifier.padding(innerPadding)){
            Text(
                "HOME SCREEN",
                fontSize = 50.sp
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){

}
