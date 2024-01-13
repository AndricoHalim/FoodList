package com.andricohalim.jetfoodlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andricohalim.jetfoodlist.ui.theme.JetFoodListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetFoodListTheme {
                JetFoodListApp()
            }
        }
    }
}

@Composable
fun JetFoodListApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        FoodList(foodList = foodList)
    }
}

@Composable
fun FoodList(foodList: List<Food>) {
    LazyColumn {
        items(foodList) { foodItem ->
            FoodItem(food = foodItem)
        }
    }
}

@Composable
fun FoodItem(food: Food) {
    Card(
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
        ),
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = food.imageResourceId),
                contentDescription = null,
                modifier = Modifier.width(80.dp).height(80.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = food.name,
                modifier = Modifier
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetFoodListTheme {
        JetFoodListApp()
    }
}