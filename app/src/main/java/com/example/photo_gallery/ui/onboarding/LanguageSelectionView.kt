import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.photo_gallery.R

data class LanguageOption(
    val id: Int,
    val name: String,
    val flagRes: Int
)

@Composable
fun LanguageSelectionList(
    options: List<LanguageOption>
) {
    var selectedOption by remember { mutableStateOf<LanguageOption?>(null) }

    LazyColumn {
        items(options.size) { index ->
            val isSelected = options[index] == selectedOption

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        selectedOption = if (isSelected) null else options[index]
                    }
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {


                Spacer(modifier = Modifier.width(8.dp))

                Image(
                    painter = painterResource(id = options[index].flagRes),
                    contentDescription = null,
                    modifier = Modifier.size(48.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(text = options[index].name)

                Spacer(modifier = Modifier.weight(1f))

                if (isSelected) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_select_circle),
                        contentDescription = null,
                        tint = Color.Blue
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_unselect_circle),
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }
            }
        }
    }
}

@Composable
fun LanguageSelectionScreen() {
    val languageOptions = remember {
        listOf(
            LanguageOption(1, "English", R.drawable.ic_english),
            LanguageOption(2, "Spanish", R.drawable.ic_spanish),
            LanguageOption(3, "French", R.drawable.ic_french)
            // Add more language options as needed
        )
    }

    LanguageSelectionList(options = languageOptions)
}
