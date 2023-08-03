package com.example.greetingcard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingWithText("Android", "Emill")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier)
{
    Text(
        text = message,
        fontSize = 36.sp,
    )
    Text(
        text = from,
        fontSize = 24.sp,
    )
}
@Preview(showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    GreetingCardTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Daniel!", from ="- from Emill")    }
}