package app.snapcart.cashier.ui.view.onboard.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import app.snapcart.cashier.R
import app.snapcart.cashier.ui.widgets.CashierButton


@Composable
fun OnboardContent(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            .padding(horizontal = 16.dp)
            ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1.0f))
        Image(
            painterResource(R.drawable.on_board_1),
            modifier = Modifier.padding(horizontal = 64.dp),
            contentDescription = "Onboading image",
            contentScale = ContentScale.FillWidth,
        )
        Spacer(modifier = Modifier.weight(0.4f))
        Text(
            text = stringResource(id = R.string.onboard_title),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge.copy(color = MaterialTheme.colorScheme.onPrimary),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = stringResource(id = R.string.onboard_sub_title),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onPrimary),
        )
        Spacer(modifier = Modifier.weight(1.0f))
        CashierButton(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onBackground,
                disabledContainerColor = MaterialTheme.colorScheme.tertiary,
                disabledContentColor = MaterialTheme.colorScheme.onTertiary,
            ),
            ) {
            Text(
                text = stringResource(id = R.string.get_started),
                color = MaterialTheme.colorScheme.primary,
                )
        }
        Spacer(modifier = Modifier.height(32.dp))
    }
}