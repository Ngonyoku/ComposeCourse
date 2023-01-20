package com.ngonyoku.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier

import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * LazyColumn is the equivalent of RecyclerView
         * */

        setContent {
//            LazyColumnImplementationUsingItemsIndexed(listOf("Java", "Kotlin", "C++", "Python"))
//            LazyColumnImplementationUsingItems()
            ScrollableColumn()
        }
    }
}

@Composable
fun ScrollableColumn() {
    val scrollState = rememberScrollState()
    Column(
        Modifier
            .verticalScroll(scrollState)
    ) {
        for (i in 1..100) {
            Text(
                text = "Item at position -> $i",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun LazyColumnImplementationUsingItemsIndexed(list: List<String>) {
    LazyColumn() {
        itemsIndexed(
            list
        ) { index, item ->

            Text(
                text = item,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun LazyColumnImplementationUsingItems() {
    LazyColumn() {
        items(20) {
            Text(
                text = "Item Index -> $it", //Displays the Index
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}

