package com.ngonyoku.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ngonyoku.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LearningColumns()
        }
    }
}

@Composable
fun LearningRows() {
    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 1..5) {
            Text(
                text = "Value $i",
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@Composable
fun LearningColumns() {
    /* The Column Trailing Lambda is a used to stack views on top of each other
    * */
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        for (i in 1..10) {
            Text(
                text = "Value $i",
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Monospace
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun displayPreview() {
    Surface {
        LearningColumns()
//        LearningRows()
    }
}
