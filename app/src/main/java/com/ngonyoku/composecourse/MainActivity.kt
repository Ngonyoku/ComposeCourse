package com.ngonyoku.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ngonyoku.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Greetings(name = "NGONYOKU")
        }
    }
}

@Composable //Views are Now composables
fun Greetings(name: String) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Hello $name",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            color = Color.Magenta,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun Preview() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Greetings(name = "RickMan!")
    }
}