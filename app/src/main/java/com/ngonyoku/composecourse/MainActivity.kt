package com.ngonyoku.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .border(5.dp, Color.Blue)
                    .padding(16.dp)
                    .border(5.dp, Color.Black)
                    .padding(25.dp)
                    .border(2.dp, Color.Yellow)
//                    .padding(top = 16.dp, start = 8.dp)
//                    .requiredWidth(300.dp)
            ) {
                for (i in 1..2) {
                    Text(text = "Text $i")
                }
                Text(
                    text = "Clickable Text",
                    Modifier
                        .clickable {

                        }
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    modifier = Modifier
                        .border(3.dp, Color.Green)
                        .padding(20.dp, 20.dp)
                        .offset(30.dp, 20.dp) //Used to position views on X Y axis
                        .border(5.dp, Color.Black),
                    text = "Off Set",
                )
            }
        }
    }
}
