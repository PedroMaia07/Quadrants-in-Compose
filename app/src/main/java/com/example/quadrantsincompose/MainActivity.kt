package com.example.quadrantsincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantsincompose.ui.theme.QuadrantsinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantsinComposeTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()  ,
            horizontalAlignment = Alignment.CenterHorizontally ,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = modifier.weight(1f)
            ) {
                 Content(
                     title = stringResource(R.string.text_composable),
                     description = stringResource(R.string.displays_text_and_follows_the_recommended_material_design_guidelines),
                     backGroundColor = Color(0xFFEADDFF),
                     modifier = Modifier.weight(1f)

                 )
                Content(
                    title = stringResource(R.string.image_composable)     ,
                    description = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                    backGroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(1f)
                )                                                                                                                       
            }
            Row(
                modifier = modifier.weight(1f)
            ) {
                 Content(
                     title = stringResource(R.string.row_composable),
                     description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                     backGroundColor = Color(0xFFB69DF8),
                     modifier = Modifier.weight(1f)

                 )
                Content(
                    title = stringResource(R.string.column_composable),
                    description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                    backGroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}


@Composable
private fun Content(
    title: String,
    description: String,
    backGroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .background(backGroundColor)
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text= title,
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold ,
            color = Color.Black
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold ,
            color = Color.Black
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantsinComposeTheme {
        //Greeting("Android")
    }
}