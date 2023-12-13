import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Preview
@Composable
fun HappyDaySummary(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth().padding(start = 28.dp,end = 28.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                "伤心",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                "  1天",
                style = MaterialTheme.typography.headlineSmall
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                "快乐",
                style = MaterialTheme.typography.headlineLarge
            )
            Text(
                "  1天",
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
    Spacer(modifier = Modifier.height(32.dp))
}

